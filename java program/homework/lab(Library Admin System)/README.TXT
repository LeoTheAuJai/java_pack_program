

## 📄 README.md (英文版)

```markdown
# Library Administration System

A Java-based **Library Management System** that allows administrators to manage book records (ISBN, Title, Availability) using custom data structures (`MyLinkedList`, `MyQueue`). The system provides a graphical user interface (GUI) for easy interaction.

## 🎯 Purpose

This program demonstrates:
- Custom linked list implementation (`MyLinkedList`)
- Custom queue implementation (`MyQueue`)
- GUI development in Java
- File I/O for data persistence
- Object-oriented design with interfaces (`MyList`)

## 👥 Contributors

- Poon Wing Hei (21099589D)
- Au Sai Chun (21105253D)

## 🚀 Features

### Book Management
- **Add**: Add new books with ISBN and Title
- **Edit**: Modify existing book information
- **Delete**: Remove books from the system
- **Search**: Find books by ISBN or Title
- **Display**: Show all books or sort by ISBN/Title

### Data Structures
- **`MyLinkedList<E>`**: Custom implementation of a singly linked list
- **`MyQueue<E>`**: Queue implementation using the linked list
- **`MyList<E>`**: Interface defining list operations

### File Operations
- **Save**: Persist book data to `data.txt`
- **Load Test Data**: Load sample data for testing

### GUI Interface
- User-friendly window with form fields and buttons
- Real-time display of book records in a table
- Interactive data management panel

## 📊 Class Structure

```
Library Admin System
├── Book                    # Book entity (ISBN, Title, Available)
├── GUI                     # Main user interface
├── MyLinkedList<E>         # Custom linked list
├── MyQueue<E>              # Custom queue
├── MyList<E> (interface)   # List operations contract
├── TestBook                # Book class tests
├── TestMyLinkedList        # Linked list tests
├── TestMyLinkedListExtra   # Additional linked list tests
├── TestMyQueue             # Queue tests
└── data.txt                # Persistent data storage
```

## 🛠️ Key Concepts

- **Custom Data Structures**: Implementation of linked list and queue from scratch
- **Generics**: Type-safe collections using `<E>`
- **GUI Programming**: Event-driven interface with buttons and form fields
- **File I/O**: Reading from and writing to text files
- **Object-Oriented Design**: Separation of concerns (Book model, Data structures, UI)

## 🧪 How to Run

1. **Compile all Java files**
   ```bash
   javac *.java
   ```
2. **Run the program**
   ```bash
   java GUI
   ```
3. **Use the interface**:
   - Click **Load Test Data** to populate sample books
   - Use **Add** / **Edit** / **Delete** to manage records
   - Click **Save** to persist changes
   - Use **Display All** to view all books

## 📁 File Structure

```
Library Admin System/
├── Book.java               # Book entity class
├── GUI.java                # Main GUI interface
├── MyLinkedList.java       # Custom linked list
├── MyQueue.java            # Custom queue
├── MyList.java             # List interface
├── TestBook.java           # Unit tests
├── TestMyLinkedList.java
├── TestMyLinkedListExtra.java
├── TestMyQueue.java
└── data.txt                # Persistent storage
```

## 📚 Learning Outcomes

- Implementing custom data structures from scratch
- Building GUI applications in Java
- Managing data persistence with file I/O
- Working in pairs on a collaborative project
- Applying object-oriented principles to real-world problems

---
```

---

## 📄 README.zh.md (中文版)

```markdown
# 圖書館管理系統

一個基於 Java 的**圖書館管理系統**，讓管理員可以使用自訂資料結構（`MyLinkedList`、`MyQueue`）管理書籍記錄（ISBN、書名、可借閱狀態）。系統提供圖形化使用者介面（GUI），方便操作。

## 🎯 程式目的

此程式展示：
- 自訂鏈結串列實作（`MyLinkedList`）
- 自訂佇列實作（`MyQueue`）
- Java GUI 開發
- 檔案 I/O 實現資料持久化
- 使用介面（`MyList`）的物件導向設計

## 👥 開發人員

- 潘泳希 (21099589D)
- 區世俊 (21105253D)

## 🚀 功能特色

### 書籍管理
- **新增**：加入新書籍（ISBN 與書名）
- **編輯**：修改現有書籍資訊
- **刪除**：從系統中移除書籍
- **搜尋**：按 ISBN 或書名查詢
- **顯示**：顯示所有書籍，可按 ISBN 或書名排序

### 資料結構
- **`MyLinkedList<E>`**：從頭實作的單向鏈結串列
- **`MyQueue<E>`**：基於鏈結串列的佇列實作
- **`MyList<E>`**：定義列表操作的介面

### 檔案操作
- **儲存**：將書籍資料存入 `data.txt`
- **載入測試資料**：載入範例資料用於測試

### GUI 介面
- 使用者友善的視窗，包含表單欄位與按鈕
- 即時顯示書籍記錄於表格中
- 互動式資料管理面板

## 📊 類別結構

```
圖書館管理系統
├── Book                    # 書籍實體（ISBN、書名、可借閱狀態）
├── GUI                     # 主使用者介面
├── MyLinkedList<E>         # 自訂鏈結串列
├── MyQueue<E>              # 自訂佇列
├── MyList<E> (介面)        # 列表操作合約
├── TestBook                # Book 類別測試
├── TestMyLinkedList        # 鏈結串列測試
├── TestMyLinkedListExtra   # 鏈結串列額外測試
├── TestMyQueue             # 佇列測試
└── data.txt                # 資料持久化儲存
```

## 🛠️ 學習重點

- **自訂資料結構**：從零實作鏈結串列與佇列
- **泛型**：使用 `<E>` 實現型別安全的集合
- **GUI 程式設計**：事件驅動介面，包含按鈕與表單
- **檔案 I/O**：讀寫文字檔案
- **物件導向設計**：關注點分離（Book 模型、資料結構、UI）

## 🧪 如何執行

1. **編譯所有 Java 檔案**
   ```bash
   javac *.java
   ```
2. **執行程式**
   ```bash
   java GUI
   ```
3. **使用介面**：
   - 點擊 **載入測試資料** 加入範例書籍
   - 使用 **新增** / **編輯** / **刪除** 管理記錄
   - 點擊 **儲存** 保存變更
   - 使用 **顯示所有** 查看全部書籍

## 📁 檔案結構

```
圖書館管理系統/
├── Book.java               # Book 實體類別
├── GUI.java                # 主 GUI 介面
├── MyLinkedList.java       # 自訂鏈結串列
├── MyQueue.java            # 自訂佇列
├── MyList.java             # 列表介面
├── TestBook.java           # 單元測試
├── TestMyLinkedList.java
├── TestMyLinkedListExtra.java
├── TestMyQueue.java
└── data.txt                # 資料持久化儲存
```

## 📚 學習成果

- 從零實作自訂資料結構
- 在 Java 中建構 GUI 應用程式
- 使用檔案 I/O 管理資料持久化
- 雙人協作完成專案
- 將物件導向原則應用於實際問題

---
```

---

## 📝 對應 dataset 格式

```javascript
{
    id: 19,
    title: "Java 圖書館管理系統 (Library Admin System)",
    description: "一個使用自訂資料結構（鏈結串列、佇列）實作的圖書館管理系統，支援書籍的增刪改查、檔案儲存與 GUI 介面。雙人協作完成。",
    technologies: ["Java", "BlueJ", "GUI", "Data Structure"],
    githubUrl: "https://github.com/LeoTheAuJai/java_pack_program/tree/main/java%20program/lab/LibraryAdminSystem",
    imageColor: "from-amber-500 to-orange-500",
    features: [
        "自訂鏈結串列 (MyLinkedList) 實作",
        "自訂佇列 (MyQueue) 實作",
        "書籍增刪改查功能",
        "GUI 圖形化介面",
        "檔案儲存與載入 (data.txt)",
        "雙人協作開發"
    ]
}
```
