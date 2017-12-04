/**
 * @Author: laiqiuhua.
 * @Date: 2017/8/1 15:47.
 */
public class InitialRegionDatabase {
//    public void initRegionData() {
//        Excel excel = new Excel(ExcelReadUtil.readExcel(new File("D:/行政区划数据库_with+经纬度-省市区-邮编-区号-拼音-简称.xls")));
//
//        TableEntity tableEntity = ExcelTableUtil.getTableEntity(excel.getWorkbook().getSheetAt(0), new ExcelReaderConfig(), (short)1);
//        List<DataEntity> dataEntities = tableEntity.getDataEntityList();
//        List<RegionDatabaseEntity> regionEntities = new ArrayList<>();
//        for (int i = 0; i < dataEntities.size(); i++) { // 行
//            DataEntity dataEntity = dataEntities.get(i);
//            List<FieldEntity> fieldEntities = dataEntity.getFieldEntityList();
//            RegionDatabaseEntity regionDatabaseEntity = new RegionDatabaseEntity();
//            // 数据列从第二行开始的，第一行是标题列
//            for (int j = 0; j < fieldEntities.size(); j++) { // 列
//                FieldEntity fieldEntity = fieldEntities.get(j);
//                String name = fieldEntity.getName();
//                String value = fieldEntity.getValue();
//                if("ID".equals(name)) {
//                    regionDatabaseEntity.setId(value);
//                }
//                if("Name".equals(name)) {
//                    regionDatabaseEntity.setName(value);
//                }
//                if("ParentId".equals(name.trim())) {
//                    regionDatabaseEntity.setParentId(value);
//                }
//                if("ShortName".equals(name)) {
//                    regionDatabaseEntity.setShortName(value);
//                }
//                if("LevelType".equals(name)) {
//                    regionDatabaseEntity.setLevelType(Integer.valueOf(value));
//                }
//                if("CityCode".equals(name)) {
//                    regionDatabaseEntity.setCityCode(value);
//                }
//                if("ZipCode".equals(name)) {
//                    regionDatabaseEntity.setZipCode(value);
//                }
//                if("MergerName".equals(name)) {
//                    regionDatabaseEntity.setMergerName(value);
//                }
//                if("lng".equals(name)) {
//                    regionDatabaseEntity.setLng(value);
//                }
//                if("Lat".equals(name)) {
//                    regionDatabaseEntity.setLat(value);
//                }
//                if("Pinyin".equals(name)) {
//                    regionDatabaseEntity.setPinyin(value);
//                }
//            }
//            regionEntities.add(regionDatabaseEntity);
//        }
//        regionDatabaseRepo.save(regionEntities);
//    }
}
