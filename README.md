# 标题 demo
# 一级标题
## 二级标题
一级标题
===
二级标题
---

# 段落demo
第一段  
第二段  
第三段

# 文本demo 
*斜体*  
**加粗**  
***斜体与加粗***  



# 列表demo
## 无序列表
 - 列表一  
   - 列表1.1
   - 列表1.2
 - 列表二
   - 列表2.1
   - 列表2.2
 - 列表三
   - 列表3.1
     - 列表3.1.1
   - 列表3.2
   
   
## 有序列表  
1. 列表一
  1. 列表1.1
  2. 列表1.2
2. 列表二
  1. 列表2.1
  2. 列表2.2
  
# 链接demo  
## 内嵌式链接
- 外部链接:[百度](https://www.baidu.com)
- 内部链接:链接仓库的其他文件[README2.md](README2.md)
- 内部链接:链接本文档的其他部分[文本demo](README.md#文本demo)   

## 引用式链接
- 外部链接:[百度]
- 内部链接:链接仓库的其他文件[README2.md]
- 内部链接:链接文档的其他部分[文本demo]

# 图片demo
- 图片的语法    
``` ![alt](url "text") ```

- 链接方式
  - 内嵌式链接
    - 外部图片  
    ![百度-log](https://www.baidu.com/img/bd_logo1.png "百度")
    - 仓库中文件
    ![头像](resource/images/26a79f1e7cdcc3faee72be643aeb8bdd.png "头像")    
  - 引用式链接  
    - 外部图片  
    ![百度-log][baidu-log]  
    - 仓库中文件  
    ![][portrait-log]


# 分割线
aaaaaaa

---

bbbbbbb

aaa

***

bbb

aaa

___

bbb


# 引用demo
- 单重引用  
> 你还不来,我怎敢老去。

出自:张爱玲

- 多重引用  
>>> 多重引用实例

# 代码块demo

- 块式代码
  - 使用 '反引号'
    ```java
      int i = 10;
      String str = "makedown";
    ```
  - 使用四个空格(此处没有验证成功)
  
  占位段落

    int i = 10;  
    String str = "makedown";  
- 行内代码
  这是一个代码指令`char a = 'a'`

# html代码
<p align="center">hello markdown</p>

# 表格demo  
- 表格语法
```
| 第一列 | 第二列 | 第三列 |
|---|---|---|
```

- 表格内容对其方式   

|第一列|第二列|第三列|
|---|:---:|---:|  
|aaaaaaa|bbbbbbbb|cccccccc|  
|![百度log][baidu-log]|**b**|[百度]|  


# GFM
> github flvored markdown  

## task list

- [ ] task1
- [x] task2
- [ ] task3

# emoji 表情符号  

:dolphin:







<!--文档中用到的链接部分-->
[百度]:https://www.baidu.com
[README2.md]:README2.md
[文本demo]:README.md#文本demo

[baidu-log]:https://www.baidu.com/img/bd_logo1.png  
[portrait-log]:resource/images/26a79f1e7cdcc3faee72be643aeb8bdd.png
