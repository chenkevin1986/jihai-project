###项目准备

1、推荐使用Intellij IDEA 开发工具，请到官网下载旗舰版

2、选择公共的证书服务器进行注册

```http
在其输入框内输入如下链接：
http://idea.imsxm.com 
或者
http://idea.iteblog.com/key.php
当然闲得蛋疼的话，也可以直接搭建一个专属自己的证书服务器
```

3、本项目采用了lombok框架，大家可以先简单学习一下，超级简单。其中需要注意的是，若想使用IDEA运行项目，请先下载lombok插件，然后在设置中激活**Annotation Processing**即可。

4、安装mysql 记得字符集一定要是UTF-8的。

### 使用IDEA运行项目

1、先运行`jihai-eureka-server`项目中的`EurekaApplication`。你可以打开如下链接`http://localhost:1111`,查看是否启动成功

2、在运行`jihai-config-server`项目之前，修改`config-repo`目录下`app-server`目录中与数据库相关的配置的用户名与密码后，再运行`jihai-config-server`。可以通过`http://localhost:1111`,查看`config-server`是否已经成功注册。然后在浏览器上键入`http://localhost:7001/app-server/dev`查看是否已加载了`app-server`应用的开发环境配置文件`application.yml`。

3、最后运行`jihai-app-server`。启动后，可以通过`http://localhost:1111`,查看`app-server`是否已经成功注册。





