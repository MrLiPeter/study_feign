# Feign的学习项目
一、什么是OpenFeign

二、OpenFeign远程调用的基本语法
1、无参方法的的远程调用


2、普通表单远程调用

4、传递实体参数的远程方法调用

三、OpenFeign通讯优化
1、gzip:
● 概念
数据格式，采用deflate格式压缩。
● 作用
网络数据压缩后实际上降低了网络传输的字节，可以加快网页加载速度。
另外搜索引擎直接抓取gzip文件比直接抓取普通文件更快。
2、Http请求中关于压缩传输协议的规定
3、OpenFiegn运行gzip压缩
只影响到微服务调用之间的调用的压缩数据传输，不影响浏览器和ApplicationClient的传输。
4、配置OpenFiegn请求-应答gzip压缩
