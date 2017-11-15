#day10 Eclipse#
1. 免费
2. 纯java语言编写
3. 免安装，绿色版
4. 扩展性强  

src 源包  
bin编译的文件夹  
如何运行： 
ctrl + F11 run运行  
run as java aplication  
红色波浪线：错误  
黄色波浪线：警告  
Window--Show View—Console   找视窗  
修改代码区的字体大小颜色  window -- Preferences -- General -- Appearance -- Colors And Fonts -- Java修改 -- Java Edit Text Font  
行号的显示和隐藏：  
显示：在代码区域的最左边的空白区域，右键 -- Show Line Numbers即可。
隐藏：把上面的动作再做一次。  
### 快捷键 ###

alt + / 内容辅助键	main + alt + /   main方法  
ctrl + shift + f 代码格式化  
crtl + shift + o 导包  
注释 选中内容 ctrl + shift +/  
ctrl + /  
代码移动 选中代码alt+上下箭头  
看源码：选中类名，F3看源码。或者ctrl+点击  
alt + shift + s+对应的下划线字母	c无参，o带参自动生成构造方法，r为get()set()方法  

### jar包 ###
就是多个class文件的压缩包  
用别人写好的东西  
如何打jar包？  
> 选中项目-右键-Export-Java-jar-自己制定一个路径和名称-finish     

如何做帮助文档？
> 针对源程序添加文档注释  
> 选中项目-右键-export-java-javadoc-finish
  
使用?
> 复制jar包到项目路径并添加至构建路径中
  
### eclipse中源码查看问题 ###
> attach source  
external location  
找到jdk安装目录文件夹中的src.zip文件。选中确认。

F3查看，或者选中类名ctrl+点击  

删除项目
> 选中项目 – 右键 – 删除 从项目区域中删除 ；从硬盘上删除  

导入项目
> 项目区域右键找import，general展开，找existing projects into wordkspace-next 选中要导入的项目（名称）  

不能新建或导入同名的项目，随意建议的文件夹不能作为项目。  
修改项目名得改配置.project <name>里面的名字。  
### debug   

双击有效程序行，设置断点。  
debug as 调试  
f6一行行运行调试  
**如何去断点**：debug视图variables界面里的breakpoints 点击双叉