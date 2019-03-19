## **验证activity的周期**
姓名：黄毅辉    学号：123012016057

1.首先打开app

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/open.jpg)

在studio可以看到依次调用了onCreate（），onStart（），onResume（）三个函数
  
![Image text](https://github.com/blazejack/work1/raw/master/photo/one/open1.png)

2.将app切换到后台

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/switch.jpg)

因为当前活动是是逐渐被完全覆盖，所以依次调用了onPause（），onStop（）两个函数

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/switch1.png)

3.返回到app中

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/return.jpg)

可以看到调用了 onRestart（），onStart（），onResume（）三个函数

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/return1.png)

4.退出app

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/quit.jpg)

app先是逐渐被完全覆盖，之后销毁程序。所以依次调用了onPause（），onStop（），onDestroy（）三个函数

![Image text](https://github.com/blazejack/work1/raw/master/photo/one/quit1.png)
