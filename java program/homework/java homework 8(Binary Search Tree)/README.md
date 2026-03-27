
## 📄 Homework 8 - 二元搜尋樹 (Binary Search Tree)

### README.md (英文版)

```markdown
# Binary Search Tree (BST) Implementation

A complete Java implementation of a **Binary Search Tree** data structure with generic type support. The BST supports insertion, deletion, search, and three types of tree traversals (inorder, preorder, postorder).

## 🎯 Purpose

This program demonstrates:
- Binary Search Tree data structure
- Tree traversal algorithms (inorder, preorder, postorder)
- Recursive algorithms
- Generic class design with Comparator support

## 🚀 Features

- **Insert**: Add elements while maintaining BST property
- **Search**: Check if an element exists in the tree (O(log n))
- **Delete**: Remove elements with three cases (leaf, one child, two children)
- **Traversals**:
  - **Inorder**: Left → Root → Right (produces sorted order)
  - **Preorder**: Root → Left → Right
  - **Postorder**: Left → Right → Root
- **Path**: Get the path from root to a specific element
- **Iterator**: Inorder iterator for the tree
- **Generic**: Works with any `Comparable` type or custom `Comparator`

## 🧪 Example Output

```
Inorder (sorted): Adam Daniel George Jones Micheal Peter Tom 
Postorder: Daniel Adam Jones Peter Tom Micheal George 
Preorder: George Adam Daniel Micheal Jones Tom Peter 
The number of nodes is 7
Is Peter in the tree? true
A path from the root to Peter is: George Micheal Tom Peter
```

## 📊 BST Visualization

```
        George
       /      \
    Adam     Micheal
      \     /      \
    Daniel Jones    Tom
                   /
                Peter
```

## 🛠️ Key Concepts

- **BST Property**: Left subtree < Root < Right subtree
- **Recursion**: Used for traversals and many operations
- **Generic Types**: `BST<E>` supports any comparable type
- **Three Deletion Cases**:
  1. Node with no children → simply remove
  2. Node with one child → replace with child
  3. Node with two children → replace with inorder successor

## 📚 Learning Outcomes

- Understanding binary search tree operations
- Implementing recursive tree algorithms
- Using generics for type-safe data structures
- Tree traversal methods and their applications

---
```

### README.zh.md (中文版)

```markdown
# 二元搜尋樹 (Binary Search Tree) 實作

一個完整的 Java 二元搜尋樹資料結構實作，支援泛型。BST 支援插入、刪除、搜尋，以及三種樹的遍歷方式（中序、前序、後序）。

## 🎯 程式目的

此程式展示：
- 二元搜尋樹資料結構
- 樹的遍歷演算法（中序、前序、後序）
- 遞迴演算法
- 支援 Comparator 的泛型類別設計

## 🚀 功能特色

- **插入**：添加元素並維持 BST 性質
- **搜尋**：檢查元素是否存在於樹中（O(log n)）
- **刪除**：處理三種刪除情況（無子節點、單子節點、雙子節點）
- **遍歷**：
  - **中序**：左 → 根 → 右（輸出已排序結果）
  - **前序**：根 → 左 → 右
  - **後序**：左 → 右 → 根
- **路徑**：從根到指定元素的路徑
- **迭代器**：中序遍歷的迭代器
- **泛型**：支援任何 `Comparable` 型別或自訂 `Comparator`

## 🧪 輸出範例

```
Inorder (sorted): Adam Daniel George Jones Micheal Peter Tom 
Postorder: Daniel Adam Jones Peter Tom Micheal George 
Preorder: George Adam Daniel Micheal Jones Tom Peter 
The number of nodes is 7
Is Peter in the tree? true
A path from the root to Peter is: George Micheal Tom Peter
```

## 📊 BST 視覺化

```
        George
       /      \
    Adam     Micheal
      \     /      \
    Daniel Jones    Tom
                   /
                Peter
```

## 🛠️ 學習重點

- **BST 性質**：左子樹 < 根節點 < 右子樹
- **遞迴**：用於遍歷和許多操作
- **泛型**：`BST<E>` 支援任何可比較的型別
- **三種刪除情況**：
  1. 無子節點 → 直接刪除
  2. 單子節點 → 用子節點取代
  3. 雙子節點 → 用中序後繼節點取代

## 📚 學習成果

- 理解二元搜尋樹的操作
- 實作遞迴樹演算法
- 使用泛型設計型別安全的資料結構
- 樹的遍歷方法及其應用

---
```

---

## 📝 對應 dataset 格式（合併版）

如果你想在個人網站上用一張卡片展示所有 Java 作業：

```javascript
{
    id: 18,
    title: "Java 資料結構與物件導向作品集",
    description: "涵蓋從基礎到進階的 Java 作業合集，包括時區轉換、形狀計算系統、Stack/Queue、二元搜尋樹等完整實作。",
    technologies: ["Java", "OOP", "Data Structure", "BlueJ"],
    githubUrl: "https://github.com/LeoTheAuJai/java_pack_program",
    imageColor: "from-blue-500 to-indigo-400",
    features: [
        "香港時間轉倫敦時間轉換器 (時區轉換)",
        "形狀計算系統 (抽象類別、介面、繼承)",
        "Stack & Queue 實作 (泛型、LIFO、FIFO)",
        "二元搜尋樹 (BST、遍歷、遞迴)"
    ]
}
```
