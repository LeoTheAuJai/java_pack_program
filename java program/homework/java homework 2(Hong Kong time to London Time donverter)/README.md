
---

## 📄 README.md (英文版)

```markdown
# Hong Kong to London Time Converter

A Java program that converts **Hong Kong time (UTC+8)** to **London time (UTC+0)** and displays the result in 12-hour format with AM/PM notation.

## 🎯 Purpose

This program demonstrates:
- Time zone conversion logic
- Clock display implementation using object-oriented design
- 12-hour vs 24-hour time format conversion
- Modular class design (`ClockDisplay`, `NumberDisplay`)

## 🚀 How It Works

1. **Initialization**: Sets Hong Kong time to 11:59 and London time to 10:30.
2. **Time Tick**: Advances both clocks by one minute (to 12:00 HK, 10:31 London).
3. **Conversion Logic**:
   - Extracts hours and minutes from both clocks
   - Converts 24-hour format to 12-hour format
   - Determines AM/PM based on whether the hour is >= 12
   - Handles the special case where 12:00 becomes 12:00 PM (not 00:00)
4. **Output**: Displays both times in 12-hour format with AM/PM.

### Example Output
```
12:00 P.M.
10:31 A.M.
```

## 🛠️ Key Concepts

- **Object-Oriented Programming**: Uses `ClockDisplay` and `NumberDisplay` classes to model a digital clock.
- **Encapsulation**: Clock logic is separated from the conversion logic.
- **Time Conversion**: Converts between 24-hour and 12-hour formats.
- **Modular Design**: `NumberDisplay` handles digit rollover (60 minutes → 1 hour, 24 hours → reset).

## 📁 Code Structure

| Class | Description |
|-------|-------------|
| `ClockDisplay` | Manages hours and minutes, handles time ticks, and displays formatted time. |
| `NumberDisplay` | Manages a single digit display with rollover logic (e.g., 0-59 for minutes, 0-23 for hours). |
| `MyClock` | Main class that performs the time conversion and prints the result. |

## 🧪 How to Run

1. **Compile all Java files**
   ```bash
   javac ClockDisplay.java NumberDisplay.java MyClock.java
   ```
2. **Run the program**
   ```bash
   java MyClock
   ```

## 📚 Learning Outcomes

- Understanding time zone differences (Hong Kong UTC+8, London UTC+0)
- Converting between 24-hour and 12-hour time formats
- Using object-oriented design to model real-world systems
- Handling edge cases (e.g., 12:00 AM/PM conversion)

---
```

---

## 📄 README.zh.md (中文版)

```markdown
# 香港時間轉倫敦時間轉換器

一個 Java 程式，將**香港時間（UTC+8）**轉換為**倫敦時間（UTC+0）**，並以 12 小時制（含上/下午）顯示結果。

## 🎯 程式目的

此程式展示：
- 時區轉換邏輯
- 使用物件導向設計實作時鐘顯示
- 24 小時制與 12 小時制的轉換
- 模組化類別設計（`ClockDisplay`、`NumberDisplay`）

## 🚀 運作方式

1. **初始化**：設定香港時間為 11:59，倫敦時間為 10:30。
2. **時間前進**：將兩個時鐘各前進一分鐘（香港 → 12:00，倫敦 → 10:31）。
3. **轉換邏輯**：
   - 從兩個時鐘提取小時和分鐘
   - 將 24 小時制轉為 12 小時制
   - 根據小時是否 >= 12 判斷上/下午
   - 處理特殊情況（12:00 顯示為 12:00 PM，而非 00:00）
4. **輸出結果**：以 12 小時制顯示兩個時間，標明上/下午。

### 輸出範例
```
12:00 P.M.
10:31 A.M.
```

## 🛠️ 學習重點

- **物件導向程式設計**：使用 `ClockDisplay` 和 `NumberDisplay` 類別建模數位時鐘。
- **封裝**：時鐘邏輯與轉換邏輯分離。
- **時間轉換**：在 24 小時制和 12 小時制之間轉換。
- **模組化設計**：`NumberDisplay` 處理數字進位（60 分鐘 → 1 小時，24 小時 → 歸零）。

## 📁 程式碼結構

| 類別 | 說明 |
|------|------|
| `ClockDisplay` | 管理小時和分鐘，處理時間前進，輸出格式化時間。 |
| `NumberDisplay` | 管理單一數字顯示，具備進位邏輯（例如 0-59 分鐘、0-23 小時）。 |
| `MyClock` | 主類別，執行時間轉換並輸出結果。 |

## 🧪 如何執行

1. **編譯所有 Java 檔案**
   ```bash
   javac ClockDisplay.java NumberDisplay.java MyClock.java
   ```
2. **執行程式**
   ```bash
   java MyClock
   ```

## 📚 學習成果

- 理解時區差異（香港 UTC+8，倫敦 UTC+0）
- 在 24 小時制和 12 小時制之間進行轉換
- 使用物件導向設計建模真實世界系統
- 處理邊界情況（例如 12:00 AM/PM 的轉換）

---
```

---

## 📝 對應 dataset 格式

如果你想把這個專案加到個人網站：

```javascript
{
    id: 17,
    title: "Java 香港時間轉倫敦時間轉換器",
    description: "一個 Java 程式，將香港時間（UTC+8）轉換為倫敦時間（UTC+0），並以 12 小時制顯示。展示物件導向時鐘設計與時區轉換邏輯。",
    technologies: ["Java", "BlueJ", "OOP"],
    githubUrl: "https://github.com/LeoTheAuJai/java_pack_program/tree/main/java%20program/homework/java%20homework%202",
    imageColor: "from-teal-500 to-emerald-400",
    features: [
        "時區轉換（UTC+8 → UTC+0）",
        "24 小時制轉 12 小時制",
        "AM/PM 標示",
        "物件導向時鐘設計"
    ]
}
```

---
