package com.jihai.mengmian.kit;

import com.jihai.mengmian.utils.common.LOG;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zohar on 17-1-18.
 */
public class SqlKit {

    /**
     * 执行sql
     *
     * @param dataSource
     * @param sqlPath
     * @return 执行的行数
     */
    public static int[] excuteSql(DataSource dataSource, String sqlPath) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            Statement statement2 = connection.createStatement();
            String[] sqlLines = readSqlLines(sqlPath);
            for (String line : sqlLines) {
                LOG.info(SqlKit.class, line);
                statement2.addBatch(line);
            }
            int[] resultRows = statement2.executeBatch();

            LOG.dubug(SqlKit.class, "execute " + resultRows.length + "rows");
            connection.commit();
            return resultRows;
        } catch (SQLException e) {
            try{
                if(connection != null){
                    connection.rollback();
                }
            }catch (SQLException e2){

            }
            LOG.error(SqlKit.class, "create sql has error");
            LOG.error(SqlKit.class, e.getSQLState());
            LOG.error(SqlKit.class, e.getMessage());
            LOG.error(SqlKit.class, "please check or manual execute sql");
        } finally {
            try{
                if(connection != null){
                    connection.close();
                }
            }catch (SQLException e2){

            }
            LOG.info(SqlKit.class, "check tables over");
        }
        return null;
    }

    public static String[] readSqlLines(String sqlPath) {
        StringBuffer sqlBuffer = new StringBuffer();
        String[] sqlLines = null;
        try {
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(sqlPath);
            //InputStream is = SqlKit.class.getClassLoader().getResourceAsStream(sqlPath);
            BufferedReader bufferedReader = null;
            bufferedReader = new BufferedReader(
                    new InputStreamReader(is, "UTF-8"));
            String temp = "";
            while ((temp = bufferedReader.readLine()) != null) {
                sqlBuffer.append(temp);
            }
            bufferedReader.close();

            String sqls = sqlBuffer.toString();

            sqlLines = sqls.split(";");
        } catch (IOException e) {
            LOG.error(SqlKit.class, "no sql file found");
        }
        return sqlLines;
    }
}