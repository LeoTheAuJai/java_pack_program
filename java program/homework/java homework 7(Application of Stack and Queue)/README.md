
## 📄 Homework 7 - Stack 與 Queue 實作

### README.md (英文版)

```markdown
# Stack & Queue Implementation with Generics

A Java program that implements **Stack (LIFO)** and **Queue (FIFO)** data structures using **generics**. The program demonstrates fundamental data structure concepts with type-safe implementations.

## 🎯 Purpose

This program demonstrates:
- Generic class design (`<E>`)
- Stack data structure (Last-In-First-Out)
- Queue data structure (First-In-First-Out)
- Dynamic data storage using arrays or linked lists

## 🚀 Features

### `MyStack<E>` - Stack Implementation
- `push(E item)`: Adds element to the top
- `pop()`: Removes and returns the top element
- `peek()`: Returns top element without removing
- `isEmpty()`: Checks if stack is empty

### `MyQueue<E>` - Queue Implementation
- `enqueue(E item)`: Adds element to the end
- `dequeue()`: Removes and returns the front element
- `peek()`: Returns front element without removing
- `isEmpty()`: Checks if queue is empty

## 🧪 Example Output

```
(1) stack: [Tom]
(2) stack: [Tom, Susan]
(3) stack: [Tom, Susan, Kim, Michael]
(4) Michael    // pop()
(5) Kim        // pop()
(6) stack: [Tom, Susan]

(7) Queue: [Tom]
(8) Queue: [Tom, Susan]
(9) Queue: [Tom, Susan, Kim, Michael]
(10) Tom       // dequeue()
(11) Susan     // dequeue()
(12) Queue: [Kim, Michael]
```

## 🛠️ Key Concepts

- **Generics**: Type-safe data structures that work with any object type
- **LIFO (Stack)**: Last element inserted is the first to be removed
- **FIFO (Queue)**: First element inserted is the first to be removed
- **Dynamic Data Structures**: Underlying storage grows as needed

## 📚 Learning Outcomes

- Understanding Stack and Queue data structures
- Implementing generic classes in Java
- Distinguishing between LIFO and FIFO behaviors
- Testing data structures with various data types

---
```

### README.zh.md (中文版)

```markdown
# Stack 與 Queue 實作（泛型）

一個使用**泛型**實作**堆疊 (LIFO)** 和**佇列 (FIFO)** 資料結構的 Java 程式。展示基礎資料結構概念與型別安全的實作方式。

## 🎯 程式目的

此程式展示：
- 泛型類別設計 (`<E>`)
- 堆疊資料結構（後進先出）
- 佇列資料結構（先進先出）
- 使用陣列或鏈結串列的動態資料儲存

## 🚀 功能特色

### `MyStack<E>` - 堆疊實作
- `push(E item)`：將元素放入堆疊頂端
- `pop()`：移除並返回堆疊頂端元素
- `peek()`：查看頂端元素（不移除）
- `isEmpty()`：檢查堆疊是否為空

### `MyQueue<E>` - 佇列實作
- `enqueue(E item)`：將元素加入佇列尾端
- `dequeue()`：移除並返回佇列前端元素
- `peek()`：查看前端元素（不移除）
- `isEmpty()`：檢查佇列是否為空

## 🧪 輸出範例

```
(1) stack: [Tom]
(2) stack: [Tom, Susan]
(3) stack: [Tom, Susan, Kim, Michael]
(4) Michael    // pop()
(5) Kim        // pop()
(6) stack: [Tom, Susan]

(7) Queue: [Tom]
(8) Queue: [Tom, Susan]
(9) Queue: [Tom, Susan, Kim, Michael]
(10) Tom       // dequeue()
(11) Susan     // dequeue()
(12) Queue: [Kim, Michael]
```

## 🛠️ 學習重點

- **泛型**：型別安全的資料結構，適用於任何物件型別
- **後進先出 (Stack)**：最後放入的元素最先被取出
- **先進先出 (Queue)**：最先放入的元素最先被取出
- **動態資料結構**：底層儲存空間可動態增長

## 📚 學習成果

- 理解 Stack 和 Queue 資料結構的特性與差異
- 在 Java 中實作泛型類別
- 區分 LIFO 和 FIFO 的行為
- 使用不同資料型別測試資料結構
