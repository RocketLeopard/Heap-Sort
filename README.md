# Heap-Sort
堆是一种非线性结构，可以把堆看作一个数组，也可以被看作一个完全二叉树，通俗来讲堆其实就是利用完全二叉树的结构来维护的一维数组
按照堆的特点可以把堆分为大顶堆和小顶堆：  
大顶堆：每个节点的值都大于或等于其子节点的值，在堆排序算法中用于升序排列；  
小顶堆：每个节点的值都小于或等于其子节点的值，在堆排序算法中用于降序排列；

## Solution
（假设我们想要升序的排列）  
第一步：构建成大顶堆：先找到最后一个非叶子节点，比较这个节点和它的直接左右子节点，也就是将当前节点和它最大的直接子节点交换。接着检查这个新的直接子节点，是否比自己的子节点小，如果小也交换。简单的说，就是把一个小的父节点，一步步下沉。从最后一个非叶子节点循环到到根节点，就完成了大顶堆的构建。
第二步：将根节点与最后一个元素交换位置，（将最大元素"沉"到数组末端）   
第三步：交换过后可能不再满足大顶堆的条件，所以需要将剩下的N-1个元素重新构建成大顶堆    
第四步：重复第二步、第三步直到整个数组排序完成  

## 复杂度分析
平均时间复杂度为Ο(NlogN)  

## 算法应用 
常常被当做优先队列使用
