
---

## 📄 README.md (英文版)

```markdown
# Number Pyramid

A Java program that prints a symmetric **number pyramid** based on user input. The pyramid displays numbers in a pattern that increases to a peak and then decreases, forming a triangular shape.

## 🎯 Purpose

This program demonstrates:
- Nested loop control structures (`for`, `while`)
- User input handling using `Scanner`
- Formatted console output with spacing
- Pattern generation logic

## 🚀 How It Works

1. **User Input**: The program asks for the number of pyramid layers.
2. **Pyramid Generation**: For each layer, it prints:
   - Leading spaces to center the pyramid
   - Descending numbers from the layer number down to 1
   - Ascending numbers from 2 up to the layer number
3. **Output**: A symmetric number pyramid is displayed in the console.

### Example Output (Input: 5)
```
Enter the number of lines: 5
                    1
                 2  1  2
              3  2  1  2  3
           4  3  2  1  2  3  4
        5  4  3  2  1  2  3  4  5
```

## 🛠️ Key Concepts

- **Nested Loops**: Multiple loops are used to print spaces, descending numbers, and ascending numbers.
- **Conditional Spacing**: The program adjusts spacing based on number length (1-9 vs. 10+).
- **Algorithm**: The pyramid is built by:
  1. Printing spaces to align the pyramid
  2. Printing descending numbers (i to 1)
  3. Printing ascending numbers (2 to i)

## 📁 Code Structure

| Component | Description |
|-----------|-------------|
| `main()` | Program entry point; handles input and output |
| `Scanner` | Reads user input for pyramid layers |
| `while` loop | Iterates through each layer (1 to d) |
| `for` loops | Handle spacing and number printing |

## 🧪 How to Run

1. **Compile the program**
   ```bash
   javac first_class.java
   ```
2. **Run the program**
   ```bash
   java first_class
   ```
3. **Enter the number of lines** when prompted

## 📚 Learning Outcomes

- Understanding nested loops for pattern generation
- Using `Scanner` for user input
- Formatting console output with spaces
- Conditional logic for dynamic formatting

---
```

---

## 📄 README.zh.md (中文版)

```markdown
# 數字金字塔

一個 Java 程式，根據使用者輸入的層數，輸出對稱的**數字金字塔**圖案。金字塔的數字從頂端向下逐漸增加至峰值後再減少，形成三角形形狀。

## 🎯 程式目的

此程式展示：
- 巢狀迴圈控制結構 (`for`, `while`)
- 使用 `Scanner` 處理使用者輸入
- 格式化控制台輸出（空格對齊）
- 圖案生成邏輯

## 🚀 運作方式

1. **使用者輸入**：程式詢問要顯示的金字塔層數。
2. **生成金字塔**：對每一層，程式會印出：
   - 前置空格，讓金字塔置中對齊
   - 從該層數字遞減到 1
   - 從 2 遞增到該層數字
3. **輸出結果**：在控制台顯示對稱的數字金字塔。

### 執行範例（輸入：5）
```
Enter the number of lines: 5
                    1
                 2  1  2
              3  2  1  2  3
           4  3  2  1  2  3  4
        5  4  3  2  1  2  3  4  5
```

## 🛠️ 學習重點

- **巢狀迴圈**：使用多層迴圈分別處理空格、遞減數字和遞增數字。
- **條件式空格**：根據數字位數（1-9 或 10 以上）調整間距。
- **演算法**：金字塔的建構方式：
  1. 印出空格使金字塔置中
  2. 印出遞減數字（從 i 到 1）
  3. 印出遞增數字（從 2 到 i）

## 📁 程式碼結構

| 元件 | 說明 |
|------|------|
| `main()` | 程式進入點，處理輸入與輸出 |
| `Scanner` | 讀取使用者輸入的金字塔層數 |
| `while` 迴圈 | 遍歷每一層（從 1 到 d） |
| `for` 迴圈 | 處理空格與數字輸出 |

## 🧪 如何執行

1. **編譯程式**
   ```bash
   javac first_class.java
   ```
2. **執行程式**
   ```bash
   java first_class
   ```
3. **依提示輸入金字塔層數**

## 📚 學習成果

- 理解巢狀迴圈在圖案生成中的應用
- 使用 `Scanner` 處理使用者輸入
- 格式化控制台輸出（對齊、間距）
- 動態格式化的條件邏輯

---
```

---

## 📝 對應 dataset 格式

如果你想把這個專案加到個人網站：

```javascript
{
    id: 16,
    title: "Java 數字金字塔 (Number Pyramid)",
    description: "一個 Java 程式，根據使用者輸入的層數，輸出對稱的數字金字塔圖案，練習巢狀迴圈與格式化輸出。",
    technologies: ["Java", "BlueJ"],
    githubUrl: "https://github.com/LeoTheAuJai/java_pack_program/tree/main/java%20program/homework/java%20homework%20number%20pyramid",
    imageColor: "from-purple-500 to-pink-400",
    features: [
        "動態金字塔層數",
        "巢狀迴圈控制",
        "對稱數字圖案",
        "格式化輸出（空格對齊）"
    ]
}
```
