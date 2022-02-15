# CeilingRecyclerView
使用 ItemDecoration 实现 RecyclerView 吸顶效果
1. 自定义 ItemDecoration
2. ItemDecoration 原理
3. 实现 RecyclerView 吸顶效果

ItemDecoration 允许应用给具体的 View 添加具体的图画或者 layout 的偏移，
对于绘制 View之间的分割线，视觉分组边界等等是非常有用的。
当我们调用 addItemDecoration() 方法添加 decoration 的时候，
RecyclerView 就会调用该类的 onDraw 方法去绘制分割线，也就是说：
分割线是绘制出来的。
RecyclerView.ItemDecoration，该类为抽象类，官方目前只提供了一个实现类 DividerItemDecoration。