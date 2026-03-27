

## 📄 Homework 6 - 形狀計算系統 (Shape System)

### README.md (英文版)

```markdown
# Shape System - Abstract Classes & Interfaces

A Java program that demonstrates **object-oriented programming** concepts through a shape calculation system. The program defines a hierarchy of shapes (Circle, Rectangle, Square) with area and perimeter calculations, and implements a `Drawable` interface for rendering capabilities.

## 🎯 Purpose

This program demonstrates:
- Abstract classes and inheritance
- Interface implementation
- Polymorphism
- Encapsulation and method overriding

## 🚀 Features

- **Abstract Class `Shape`**: Defines abstract methods `getArea()` and `getPerimeter()`
- **Concrete Shapes**: `Circle`, `Rectangle`, `Square` inherit from `Shape` and implement specific calculations
- **`Drawable` Interface**: Defines rendering behavior; implemented by `Shape`, `Picture`, and `Canvas`
- **Test Classes**: `HW6Tester` and `PictureTester` verify functionality

## 📊 Class Hierarchy

```
Shape (abstract)
    ├── Circle
    ├── Rectangle
    └── Square (extends Rectangle)

Drawable (interface)
    ├── Shape (implements)
    ├── Picture (implements)
    └── Canvas (implements)
```

## 🧪 Example Output

```
Choose shape (c=circle, s=square, r=rectangle): c
Input the radius: 55
Area: 9503.32
Perimeter: 345.58
```

## 🛠️ Key Concepts

- **Abstract Class**: `Shape` cannot be instantiated; defines common structure for all shapes
- **Method Overriding**: Each shape provides its own implementation of area/perimeter formulas
- **Interface**: `Drawable` defines a contract for objects that can be rendered
- **Polymorphism**: Shape references can point to any concrete shape object

## 📚 Learning Outcomes

- Understanding abstract classes vs. interfaces
- Implementing inheritance hierarchies
- Using polymorphism for flexible code design
- Calculating geometric properties

---
```

### README.zh.md (中文版)

```markdown
# 形狀系統 - 抽象類別與介面

一個透過形狀計算系統展示**物件導向程式設計**概念的 Java 程式。程式定義了形狀階層（圓形、長方形、正方形），計算面積與周長，並實作 `Drawable` 介面提供繪製能力。

## 🎯 程式目的

此程式展示：
- 抽象類別與繼承
- 介面實作
- 多型
- 封裝與方法覆寫

## 🚀 功能特色

- **抽象類別 `Shape`**：定義抽象方法 `getArea()` 和 `getPerimeter()`
- **具體形狀**：`Circle`、`Rectangle`、`Square` 繼承 `Shape` 並實作具體計算
- **`Drawable` 介面**：定義繪製行為；由 `Shape`、`Picture`、`Canvas` 實作
- **測試類別**：`HW6Tester` 和 `PictureTester` 驗證功能

## 📊 類別階層

```
Shape (抽象)
    ├── Circle
    ├── Rectangle
    └── Square (繼承 Rectangle)

Drawable (介面)
    ├── Shape (實作)
    ├── Picture (實作)
    └── Canvas (實作)
```

## 🧪 輸出範例

```
選擇形狀 (c=圓形, s=正方形, r=長方形): c
請輸入半徑: 55
面積: 9503.32
周長: 345.58
```

## 🛠️ 學習重點

- **抽象類別**：`Shape` 不能被實例化，定義所有形狀的共同結構
- **方法覆寫**：每個形狀提供自己的面積/周長計算公式
- **介面**：`Drawable` 定義可被繪製的物件的合約
- **多型**：Shape 型別的變數可以指向任何具體形狀物件

## 📚 學習成果

- 理解抽象類別與介面的差異與應用時機
- 實作繼承階層
- 使用多型設計靈活的程式碼
- 計算幾何圖形的屬性
