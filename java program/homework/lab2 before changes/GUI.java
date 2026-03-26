import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.lang.Math.*;
import java.text.SimpleDateFormat;
import java.io.*;

public class GUI {
    private JLabel lb1, lb2, lb3, lb4, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14;
    private JTextField tf1, tf2;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11;
    private JFrame  frame2, frame3, frame4;
    private JScrollPane scroll;
    private String ISBN, Title = "";
    private Boolean Available;
    String[] columnNames = { "ISBN", "Title", "Avaliable" };
    DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
    private JTable table = new JTable(tableModel);
    private JTextArea ta;
    boolean checkTestData1, checkTestData2, checkTestData3, checkAdd, isExist, isCreated, ISBNClicked, TitleClicked, ISBNReverse, titleReverse = false;
    int currentSize, editIndex = 0;
    int book1Index, book2Index, book3Index, sortingIndex;
    String currentISBN;
    
    // Update list
    public void listSet() {        
        for(int i=currentSize;i<list.size();i++){
            String T = list.get(i).getTitle();
            String I = list.get(i).getISBN();
            Boolean A = list.get(i).getAvailable();
        Object[] Data = {
                // input data to the table
                I, T, A};
        tableModel.addRow(Data);
        }
    }
    
    public boolean ShowTextField() {
        isExist = false;
        if(ISBN.equals("")) {
            JOptionPane.showMessageDialog(frame2,"ISBN must be filled!","Error",JOptionPane.ERROR_MESSAGE);
        }else {
            for(int i = 0;i<list.size();i++) {
                if(ISBN.equals(list.get(i).getISBN())) {
                    editIndex = i;
                    isExist = true;
                    tf2.setText(list.get(i).getTitle());
                }
            }
        }
        return isExist;
    }
    
    public void Sorting(String e) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
        List<RowSorter.SortKey>sortKeys = new ArrayList<>();
        int column;
        if(e.equals("ISBN")) {
            column = 0;
            if(!ISBNReverse) {
                sortKeys.add(new RowSorter.SortKey(column, SortOrder.ASCENDING));
                ISBNReverse = true;
            }else {
                sortKeys.add(new RowSorter.SortKey(column, SortOrder.DESCENDING));
                ISBNReverse = false;
            }
        }else {
            column = 1;
            if(!titleReverse) {
                sortKeys.add(new RowSorter.SortKey(column, SortOrder.ASCENDING));
                titleReverse = true;
            }else {
                sortKeys.add(new RowSorter.SortKey(column, SortOrder.DESCENDING));
                titleReverse = false;
            }
            
        }
        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
    }
        
    public GUI() {
        Layout();
        time();
    }

    public void Layout() {

        // set main page
        frame2 = new JFrame("Library Admin System");
        frame2.setSize(800, 600);
        frame2.getContentPane().setLayout(new GridLayout(5, 1));
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set More>>
        frame3 = new JFrame();
        frame3.setSize(800, 600);
        frame3.getContentPane().setLayout(new BorderLayout(3, 10));
        frame3.setVisible(false);
        
        //set data management>>
        frame4 = new JFrame();
        frame4.setSize(800, 600);
        frame4.getContentPane().setLayout(new BorderLayout(3, 10));
        frame4.setVisible(false);
        
        //set Text Area
        ta = new JTextArea("");
        
        // set label
        lb1 = new JLabel("Student Name and ID: Poon Wing Hei 21099589D");
        lb2 = new JLabel("");
        lb3 = new JLabel("ISBN: ");
        lb4 = new JLabel("Title: ");
        lb7 = new JLabel("ISBN: ");
        lb8 = new JLabel("Title: ");
        lb9 = new JLabel("Available: ");
        lb10 = new JLabel("Student Name and ID: Au Sai Chun 21105253D");
        lb11 = new JLabel(new ImageIcon("HTML.png"));
        lb12 = new JLabel(new ImageIcon("C++.png"));
        lb13 = new JLabel(new ImageIcon("Java.png"));
        lb14 = new JLabel("Please click save to save the current data into a file and press proceed to process the data inside the file to replace the current data:");
        
        // set textfield
        tf1 = new JTextField("");
        tf2 = new JTextField("");

        // set button
        bt1 = new JButton("Add");
        bt2 = new JButton("Edit");
        bt3 = new JButton("Save");
        bt4 = new JButton("Delete");
        bt5 = new JButton("Search");
        bt6 = new JButton("More>>");
        bt7 = new JButton("Load Test Data");
        bt8 = new JButton("Display All");
        bt9 = new JButton("Display All by ISBN");
        bt10 = new JButton("Display All by Title");
        bt11 = new JButton("Exit");
        bt12 = new JButton("Borrow");
        bt13 = new JButton("Return");
        bt14 = new JButton("Reserve");
        bt15 = new JButton("Waiting Queue");
        bt16 = new JButton("Data Management");
        bt17 = new JButton("Save");
        bt18 = new JButton("Process data");

        // set button status
        bt3.setEnabled(false);
        bt13.setEnabled(false);
        bt14.setEnabled(false);
        bt15.setEnabled(false);
        
        
        // set button 1 (add book)
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                if(ISBN.equals("")){
                    if(Title.equals("")) {
                        JOptionPane.showMessageDialog(frame2,"ISBN and Title must be filled!","Error",JOptionPane.ERROR_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(frame2,"ISBN must be filled!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }else if(Title.equals("")) {
                    JOptionPane.showMessageDialog(frame2,"Title must be filled!","Error",JOptionPane.ERROR_MESSAGE);
                }else {
                    checkAdd = true;
                    for(int i = 0;i<list.size();i++) {
                        if(ISBN.equals(list.get(i).getISBN())) {
                            JOptionPane.showMessageDialog(frame2,"ISBN is already added!","Error",JOptionPane.ERROR_MESSAGE);
                            checkAdd = false;
                        }else if(Title.equals(list.get(i).getTitle())) {
                            JOptionPane.showMessageDialog(frame2,"Title is already added!","Error",JOptionPane.ERROR_MESSAGE);
                            checkAdd = false;
                        }
                    }
                    if(checkAdd) {
                        currentSize=list.size();
                        Book book = new Book();
                        book.setTitle(Title);
                        book.setISBN(ISBN);
                        book.setAvailable(true);
                        list.add(book);
                        listSet();
                    }
                }
            }
        });

        // set button 2 (edit book)
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                currentISBN = ISBN;
                ShowTextField();
                if(isExist) {
                    //disable all button and enable save button
                    bt1.setEnabled(false);
                    bt2.setEnabled(false);
                    bt3.setEnabled(true);
                    bt4.setEnabled(false);
                    bt5.setEnabled(false);
                    bt6.setEnabled(false);
                    bt7.setEnabled(false);
                    bt8.setEnabled(false);
                    bt9.setEnabled(false);
                    bt10.setEnabled(false);
                    bt11.setEnabled(false);
                }else if(list.size() != 0){
                    JOptionPane.showMessageDialog(frame2,"ISBN is not exist!","Error",JOptionPane.ERROR_MESSAGE);
                }        
            }
        });
        
        //change text field
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                String ISBNValue = (table.getModel().getValueAt(row, 0).toString());
                String titleValue = (table.getModel().getValueAt(row, 1).toString());
                tf1.setText(ISBNValue);
                tf2.setText(titleValue);
            }
            
        });
        
        // set button 3 (save edit)
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                boolean isExist = false;                //check input if exist
                for(int i = 0;i<list.size();i++) {
                    if(ISBN.equals(list.get(i).getISBN())) {
                        if(ISBN.equals(currentISBN)) {}
                        else {
                            JOptionPane.showMessageDialog(frame2,"ISBN is exists in the current database!","Error",JOptionPane.ERROR_MESSAGE);
                            isExist = true;
                        }
                    }
                }
                if(!isExist) {
                    list.get(editIndex).setISBN(ISBN);
                    list.get(editIndex).setTitle(Title);
                    tableModel.setValueAt(ISBN, editIndex, 0);
                    tableModel.setValueAt(Title, editIndex, 1);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(false);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);
                    bt6.setEnabled(true);
                    bt7.setEnabled(true);
                    bt8.setEnabled(true);
                    bt9.setEnabled(true);
                    bt10.setEnabled(true);
                    bt11.setEnabled(true);
                    clearTextField();
                }
            }
        });

        // set button 4 (delete book)
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                ShowTextField();
                if(isExist) {
                    if(editIndex<book1Index) {
                        book1Index -= 1;
                        book2Index -= 1;
                        book3Index -= 1;
                    }else if(editIndex == book1Index) {
                        checkTestData1 = false;
                        book2Index -= 1;
                        book3Index -= 1;
                    }else if(editIndex == book2Index) {
                        checkTestData2 = false;
                        book3Index -= 1;
                    }else if(editIndex == book3Index) {
                        checkTestData3 = false;
                    }
                    list.remove(editIndex);
                    tableModel.removeRow(editIndex);
                    clearTextField();
                }else {
                    JOptionPane.showMessageDialog(frame2,"ISBN is not exists in the current database!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // set button 5 (search book)
        bt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                clearTable();
                if(ISBN.equals("") && Title.equals("")) {}
                else if(!ISBN.equals("") && Title.equals("")) {
                    for(int i = 0;i<list.size();i++) {
                        if(list.get(i).getISBN().contains(ISBN)) {
                        String T = list.get(i).getTitle();
                        String I = list.get(i).getISBN();
                        Boolean A = list.get(i).getAvailable();
                        Object[] Data = {
                                // input data to the table
                                I, T, A};
                        tableModel.addRow(Data);
                    }
                    }
                }else if(ISBN.equals("")){
                    for(int i = 0;i<list.size();i++) {
                        if(list.get(i).getTitle().contains(Title)) {
                            String T = list.get(i).getTitle();
                            String I = list.get(i).getISBN();
                            Boolean A = list.get(i).getAvailable();
                            Object[] Data = {
                                    // input data to the table
                                    I, T, A};
                            tableModel.addRow(Data);
                        }
                    }
                }else {
                    for(int i = 0;i<list.size();i++) {
                        if(list.get(i).getISBN().contains(ISBN)) {
                            String T = list.get(i).getTitle();
                            String I = list.get(i).getISBN();
                            Boolean A = list.get(i).getAvailable();
                            Object[] Data = {
                                // input data to the table
                                I, T, A};
                            tableModel.addRow(Data);
                            }
                        else if(list.get(i).getTitle().contains(Title)) {
                            String T = list.get(i).getTitle();
                            String I = list.get(i).getISBN();
                            Boolean A = list.get(i).getAvailable();
                            Object[] Data = {
                                // input data to the table
                                I, T, A};
                            tableModel.addRow(Data);
                        }
                    }
                }
            }
        });

        // set button 6 (More>>)
        bt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                ShowTextField();
                lb11.setVisible(false);
                lb12.setVisible(false);
                lb13.setVisible(false);
                if(isExist) {
                    frame3.setVisible(true);
                    frame3.setTitle(Title);
                    lb7.setText("ISBN:" + ISBN);
                    lb8.setText("Title: " + Title);
                    Available = list.get(editIndex).getAvailable();
                    lb9.setText("Available: " + Available);
                    if(ISBN.equals(list.get(book1Index).getISBN())) {
                        lb11.setVisible(true);
                    }else if(ISBN.equals(list.get(book2Index).getISBN())) {
                        lb12.setVisible(true);
                    }else if(ISBN.equals(list.get(book3Index).getISBN())) {
                        lb13.setVisible(true);
                    }
                }
            }
        });

        // set button 7 (Load test data)
        bt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // load TestBook
                if(list.size() != 0) {
                    currentSize = list.size();
                }
                if(!checkTestData1) {
                    Book book1 = new Book();
                    book1.setTitle("HTML How to Program");
                    book1.setISBN("0131450913");
                    book1.setAvailable(true);
                    if(!isCreated) {
                        list.add(book1);
                        checkTestData1 = true;
                        book1Index = list.indexOf(book1);
                    }else {
                        list.add(book1Index, book1);
                        checkTestData1 = true;
                        book2Index += 1;
                        book3Index += 1;
                        clearTable();
                    }
                    listSet();
                }else {
                    JOptionPane.showMessageDialog(frame2,"Book HTML How to Program already in the database!","Error",JOptionPane.ERROR_MESSAGE);
                }
                if(!checkTestData2) {
                    Book book2 = new Book();
                    book2.setTitle("C++ How to Program");
                    book2.setISBN("0131857576");
                    book2.setAvailable(true);
                    if(!isCreated) {
                        list.add(book2);
                        checkTestData2 = true;
                        currentSize = list.size()-1;
                        book2Index = list.indexOf(book2);
                    }else {
                        list.add(book2Index, book2);
                        checkTestData2 = true;
                        clearTable();
                        book3Index += 1;
                    }
                    listSet();
                }else {
                    JOptionPane.showMessageDialog(frame2,"Book C++ How to Program already in the database!","Error",JOptionPane.ERROR_MESSAGE);
                }
                if(!checkTestData3) {
                    Book book3 = new Book();
                    book3.setTitle("Java How to Program");
                    book3.setISBN("0132222205");
                    book3.setAvailable(true);
                    if(!isCreated) {
                        list.add(book3);
                        checkTestData3 = true;
                        currentSize = list.size()-1;
                        book3Index = list.indexOf(book3);
                    }else {
                        list.add(book3Index, book3);
                        checkTestData3 = true;
                        clearTable();
                    }
                    listSet();
                    }else {
                        JOptionPane.showMessageDialog(frame2,"Book Java How to Program already in the database!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                isCreated = true;
                clearTextField();
            }
        });

        // set button 8 (display)
        bt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // load book
                clearTable();
                listSet();
            }
        });

        // set button 9 (display by ISBN)
        bt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // sort with ISBN
                Sorting("ISBN");
            }
        });

        // set button 10 (display by Title)
        bt10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // sort with Title
                Sorting("Title");
            }
        });

        // set button 11(Exit)
        bt11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                frame3.dispose();
            }
        });
        
        // set button 12 (Borrow)
        bt12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                bt12.setEnabled(false);
                bt13.setEnabled(true);
                bt14.setEnabled(true);
                bt15.setEnabled(true);
                Available = false;
                list.get(editIndex).setAvailable(false);
                clearTable();
                listSet();
                lb9.setText("Available: "+Available);
                ta.setText("The book is borrowed");
            }
        });
        
        // set button 13 (return)
        bt13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                
                if(queue.getSize()==0) {
                    bt12.setEnabled(true);
                    bt13.setEnabled(false);
                    bt14.setEnabled(false);
                    bt15.setEnabled(false);
                    Available = true;
                    list.get(editIndex).setAvailable(true);
                    clearTable();
                    listSet();
                    ta.setText("The book is returned.");
                    lb9.setText("Available: "+Available);
                }else {
                        
                        ta.setText("The book is returned.\n" + "The book is now borrowed by " + queue.getList().getFirst());
                        queue.dequeue();
                    }
            }
        });
        
        // set button 14 (reserve)
        bt14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
                String name = JOptionPane.showInputDialog("What's your name?");
                if(name != null) {
                    queue.enqueue(name);
                    ta.setText("The book is reserved by " + name +".");
                }
            }
        });
        
        // set button 15 (waiting queue)
        bt15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(queue.getSize()!= 0) {
                    ta.setText("The waiting queue:\n" + queue);
                }else {
                    ta.setText("No people is waiting");
                }
            }
        });
        
        // set button 16 (data management)
        bt16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    frame4.setVisible(true);
                    frame4.setTitle("Data management windows");
                    frame4.add(panel11);
            }
        });
        
        // set button 17 (save)
        bt17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    try {
                  //read file.txt
                  FileWriter file = new FileWriter("data.txt");
                  BufferedWriter buffer = new BufferedWriter(file);
                  String line;
                  // iterate through the file
                  for(int i=0; i<list.size();i++)
                  {
                      file.write(list.get(i).getTitle()+"\n");
                      file.write(list.get(i).getISBN()+"\n");
                      file.write(list.get(i).getAvailable()+"\n");
                  }
                  file.close();
                } 
                catch (IOException a) {
                  a.printStackTrace();
                }
            }
        });
        
        // set button 18 (save)
        bt18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    
            }
        });
        
        // set panel
        panel1 = new JPanel(new BorderLayout());
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel2 = new JPanel(new BorderLayout());
        panel3 = new JPanel(new FlowLayout());
        panel4 = new JPanel(new FlowLayout());
        panel5 = new JPanel(new FlowLayout());
        panel6 = new JPanel(new GridLayout(3, 1));
        panel7 = new JPanel(new FlowLayout());
        panel8 = new JPanel(new FlowLayout());
        panel9 = new JPanel(new BorderLayout());
        panel10 = new JPanel(new BorderLayout());
        panel11 = new JPanel(new FlowLayout());

        //set Table
        table.setRowHeight(30);
        table.setPreferredScrollableViewportSize(new Dimension(600, 300));
        table.setGridColor(Color.black);
        table.setShowHorizontalLines(true);
        table.setSelectionForeground(Color.DARK_GRAY);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        scroll = new JScrollPane(table);
        
        // add to log in page

        // add to panel1
        panel1.setBackground(Color.white);
        panel1.add(lb1);
        panel1.add(lb10);
        panel1.add(lb2);

        // add to panel2
        panel2.add(scroll);
        panel2.setBackground(Color.gray);

        // add to panel3
        lb3.setPreferredSize(new Dimension(50, 20));
        tf1.setPreferredSize(new Dimension(150, 20));
        lb4.setPreferredSize(new Dimension(50, 20));
        tf2.setPreferredSize(new Dimension(150, 20));
        panel3.add(lb3);
        panel3.add(tf1);
        panel3.add(lb4);
        panel3.add(tf2);

        // add to panel4
        panel4.add(bt1);
        panel4.add(bt2);
        panel4.add(bt3);
        panel4.add(bt4);
        panel4.add(bt5);
        panel4.add(bt6);
        panel4.add(bt16);

        // add to panel5
        panel5.add(bt7);
        panel5.add(bt8);
        panel5.add(bt9);
        panel5.add(bt10);
        panel5.add(bt11);

        // add panel to frame2
        frame2.getContentPane().add(panel1);
        frame2.getContentPane().add(panel2);
        frame2.getContentPane().add(panel3);
        frame2.getContentPane().add(panel4);
        frame2.getContentPane().add(panel5);
        
        // add to panel6
        panel6.add(lb7);
        panel6.add(lb8);
        panel6.add(lb9);
        panel6.setBackground(Color.WHITE);
        
        // add to panel7
        panel7.add(bt12);
        panel7.add(bt13);
        panel7.add(bt14);
        panel7.add(bt15);
        
        
        // add to panel8
        panel8.add(ta);
        panel8.setBackground(Color.WHITE);
        
        panel9.add(panel6, BorderLayout.WEST);
        panel9.add(panel10, BorderLayout.CENTER);
        panel9.setBackground(Color.WHITE);
        
        panel10.add(lb11, BorderLayout.WEST);
        panel10.add(lb12, BorderLayout.CENTER);
        panel10.add(lb13, BorderLayout.EAST);
        
        panel11.add(lb14);
        panel11.add(bt17);
        panel11.add(bt18);
        
        //add panel to frame3
        frame3.getContentPane().add(panel9, BorderLayout.NORTH);
        frame3.getContentPane().add(panel7, BorderLayout.CENTER);
        frame3.getContentPane().add(panel8, BorderLayout.SOUTH);
    }
    
    public void add() {
        ISBN = tf1.getText();
        Title = tf2.getText();
    }
    
    public void clearTextField() {
        tf1.setText("");
        tf2.setText("");
    }

    public void clearTable() {
        DefaultTableModel t = (DefaultTableModel)table.getModel();
        t.setRowCount(0);
        currentSize = 0;
    }

    //create list and queue
    MyLinkedList<Book> list= new MyLinkedList<Book>();
    MyQueue<String> queue = new MyQueue<>();

    public void time()
    {
        Thread clock = new Thread()
        {
            public void run()
            {
                try {
                    for (;;)
                    {
                        SimpleDateFormat formatter=new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",java.util.Locale.ENGLISH);
                        Date date = new Date();
                    
                    lb2.setText(formatter.format(date));
                    
                        sleep(1000);
                    } 
                }
                catch (InterruptedException e) 
                {
                        e.printStackTrace();
                }
            }
        };
        clock.start();
    }

    public static void main(String[] args) {
        new GUI();
    }
}
    


