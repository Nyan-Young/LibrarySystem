# LibrarySystem
本项目为一个图书馆管理系统。

## 一、项目技术栈
### 前端技术：HTML、CSS、JavaScript、Ajax
### 后端技术：Java、SpringMVC、MyBatis、Java ImageIO图片读写技术、MultipartFile文件上传技术、分页查询技术
### 数据库：MySQL

## 二、遇到的问题和解决办法
### 1、书籍信息SQL查询语句为什么出现了数据库报错“In aggregated query without GROUP BY, expression #1 of SELECT list contains nonaggregated column 'libsys.book_info.bcode'; this is incompatible with sql_mode=only_full_group_by”？
#### 经过上网查找相关资料，更改了mysql数据库的配置文件，去除掉“only_full_group_by”选项后，恢复正常。
### 2、mysql语句为什么出现报错“You can't specify target table 'records' for update in FROM clause update”（语句中不能同时select同一个表）？
#### select子句中，为本表重命名一下就可以了。
### 3、Mybatis的update和insert返回值如何成为修改的行数？
#### jdbc.url属性末尾加入“useAffectedRows=true”。
### 4、如何在分页的同时查询总数？
#### jdbc.url属性末尾加入“allowMultiQueries=true”，然后修改mysql语句加入“select FOUND_ROWS() as total;”即可。
