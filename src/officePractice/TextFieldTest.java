import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jidesoft.grid.TreeTable;
import com.jidesoft.grid.TreeTableModel;

public class TextFieldTest extends JFrame {
  JPanel panel;

  public TextFieldTest() {
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setTitle("Bla Blubb");
    setResizable(false);
    setLayout(null);

    panel = new JPanel();

    TreeTable treeTable = new TreeTable();
    treeTable.setModel(new MyTableModel());
    panel.setBounds(5, 5, 290, 290);
    panel.add(treeTable);
    add(panel);
    

    setVisible(true);

  }

  public static void main(String[] args) {
    TextFieldTest tt = new TextFieldTest();
  }
}

class MyTableModel extends TreeTableModel {

  @Override
  public int getColumnCount() {

    return 2;
  }

  @Override
  public String getColumnName(int column) {
    switch (column) {
      case 0:
        return "a";
      case 1:
        return "b";
      default:
        return "";
    }
  }

}