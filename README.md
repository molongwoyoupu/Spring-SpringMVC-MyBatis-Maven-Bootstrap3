
<h3>Eclipse搭建Maven项目整合SSM框架（maven+spring+springmvc+mybatis）</h3>
<h4>CSDN博客地址：https://blog.csdn.net/qq_29518175/article/details/86607735</h4>
<h4>简书地址：https://www.jianshu.com/p/bf132a691ce9</h4>
<h4>环境准备</h4>
数据库：MYSQL8.0 </br>
JAVA：JDK1.8


导入方式： import→Maven→Existing Maven projects。 </br>
启动方式： </br>
1.先install:右键项目Run As→Maven install; </br>
2.再run：右键项目Run As→Maven build...→（在Goals中输入 clean tomcat7:run）→Run</br>

<h4>Maven项目依赖版本号</h4>

<spring.version>5.1.4.RELEASE</spring.version>       </br>
<mybatis.version>3.5.0</mybatis.version>             </br>
<mybatis.spring.version>2.0.0</mybatis.spring.version>             </br>
<mybatis.paginator.version>1.2.17</mybatis.paginator.version>     </br>
<druid.version>1.0.9</druid.version>                               </br>
<mysql.version>8.0.12</mysql.version>                            </br>
<jackson.version>2.9.8</jackson.version>                           </br>
<jstl.version>1.2</jstl.version>                                    </br>
<servlet-api.version>2.5</servlet-api.version>                       </br>
<jsp-api.version>2.0</jsp-api.version>                              </br>
<pagehelper.version>5.1.8</pagehelper.version>                        </br>
