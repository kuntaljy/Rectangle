# Rectangle
## 1. 如何创建项目
step1: 从github创建项目   
step2: 从github克隆项目：git clone xxx.git  
step3: 使用gradle初始项目：gradle init --type java-library  
step4: 修改gradle配置文件：vi build.gradle，给plugins添加一行：id 'idea'
step5: 运行gradle构建命令：./gradlew idea 或者 gradle idea  
step6: 使用idea打开项目：windows操作系统使用start *.ipr，Mac系统使用open *.ipr  

## 2.不要总是习惯性的写get和set方法
1. 贫血模型的pojo并不遵循面向对象的理念
2. 使用构造函数初始化变量，而不是set方法

## 3. 测试方法编写规范
1. 方法名尽量表达完整的语义，采用下划线分割单词命名法
2. 方法体采用三段式Given  When  Then