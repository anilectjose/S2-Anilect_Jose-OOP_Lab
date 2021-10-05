import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class pet extends Applet implements ActionListener {
    String msg = "*****Pet Booking System*****";
    String msg2 = "";

    String ss1, ss2, ss3, ss4;
    String rr1 = "Arjun", rr2 = "Dog", rr3 = "2", rr4 = "7500";
    String pp1 = "Zimba", pp2 = "Cat", pp3 = "3.2", pp4 = "10000";
    String std1, std2, std3, std4, std5, std6, std7;
    Image img;

    int z = 0, z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0;
    Button ab, bc, cd, de, ef, fg, gh;

    public void init() {
        setLayout(null);
        Font f = new Font("Dialog", Font.BOLD, 22);
        setFont(f);

        ab = new Button("Add Pet");
        ab.setBounds(150, 150, 250, 50);
        add(ab);

        bc = new Button("Edit Pets");
        bc.setBounds(450, 150, 250, 50);
        add(bc);

        cd = new Button("Remove Pets");
        cd.setBounds(750, 150, 250, 50);
        add(cd);

        fg = new Button("ABOUT");
        fg.setBounds(325, 300, 250, 50);
        add(fg);

        gh = new Button("EXIT");
        gh.setBounds(625, 300, 250, 50);
        add(gh);

        img = getImage(getCodeBase(), "Anilect.jpeg");

        ab.addActionListener(this);
        bc.addActionListener(this);
        cd.addActionListener(this);
        fg.addActionListener(this);
        gh.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str == "Add Pet") {

            Frame f;
            f = new gas("Add Pet");
            f.setVisible(true);
            f.setSize(1500, 1000);
        } else if (str == "Edit Pets") {

            Frame f;
            f = new PetDisplay("Edit Pets");
            f.setVisible(true);
            f.setSize(1366, 768);
        }

        else if (str == "Remove Pets") {
            Frame f;
            f = new PetDelete("Remove Pets");
            f.setVisible(true);
            f.setSize(1500, 1000);
        }

        else if (str == "ABOUT") {

            Frame f;
            f = new About1("ABOUT");
            f.setVisible(true);
            f.setSize(1500, 1000);
        }

        else if (str == "EXIT") {
            System.exit(0);
        }
    }

    public void paint(Graphics g) {

        g.drawImage(img, 0, 0, 1366, 768, this);
        g.drawString(msg, 450, 50);
        g.drawRect(375, 18, 400, 50);
        g.drawRect(376, 19, 401, 50);
    }

    class gas extends Frame implements ActionListener {
        TextField t1, t2, t3, t4;
        Button bb1;
        Label l1, l2, l3, l4;
        String str1;

        gas(String title) {
            super(title);
            MyWindowAdapter7 adapter = new MyWindowAdapter7(this);
            addWindowListener(adapter);
            setLayout(null);

            Font f = new Font("Monospaced", Font.BOLD, 20);
            setFont(f);

            t1 = new TextField(20);
            t1.setBounds(400, 50, 400, 50);
            add(t1);

            l1 = new Label("Name");
            add(l1);
            l1.setBounds(200, 50, 200, 50);

            t2 = new TextField(20);
            t2.setBounds(400, 120, 400, 50);
            add(t2);

            l2 = new Label("Category");
            add(l2);
            l2.setBounds(200, 120, 200, 50);

            t3 = new TextField(20);
            t3.setBounds(400, 190, 400, 50);
            add(t3);

            l3 = new Label("Age");
            add(l3);
            l3.setBounds(200, 190, 200, 50);

            t4 = new TextField(20);
            t4.setBounds(400, 260, 400, 50);
            add(t4);

            l4 = new Label("Price");
            add(l4);
            l4.setBounds(200, 260, 200, 50);

            bb1 = new Button("SUBMIT");
            bb1.setBackground(Color.GREEN);
            bb1.setBounds(500, 530, 200, 50);
            add(bb1);

            bb1.addActionListener(this);

        }

        public void actionPerformed(ActionEvent ae) {

            ss1 = t1.getText();
            ss2 = t2.getText();
            ss3 = t3.getText();
            ss4 = t4.getText();
            dispose();

        }
    }

    class PetDisplay extends Frame implements ActionListener {
        TextField t1, t2, t3, t4, tt1, tt2, tt3, tt4, ttt1, ttt2, ttt3, ttt4;
        Label l1, l2, l3, l4;
        Button b1;

        PetDisplay(String title) {
            super(title);
            MyWindowAdapter13 adapter = new MyWindowAdapter13(this);
            addWindowListener(adapter);
            setLayout(null);

            Font f = new Font("Monospaced", Font.BOLD, 20);
            setFont(f);

            t1 = new TextField(20);
            t1.setBounds(10, 350, 180, 50);
            add(t1);

            tt1 = new TextField(20);
            tt1.setBounds(10, 250, 180, 50);
            add(tt1);

            ttt1 = new TextField(20);
            ttt1.setBounds(10, 150, 180, 50);
            add(ttt1);

            l1 = new Label("Name");
            add(l1);
            l1.setBounds(10, 100, 100, 50);

            t2 = new TextField(20);
            t2.setBounds(210, 350, 180, 50);
            add(t2);

            tt2 = new TextField(20);
            tt2.setBounds(210, 250, 180, 50);
            add(tt2);

            ttt2 = new TextField(20);
            ttt2.setBounds(210, 150, 180, 50);
            add(ttt2);

            l2 = new Label("Category");
            add(l2);
            l2.setBounds(210, 100, 100, 50);

            t3 = new TextField(20);
            t3.setBounds(410, 350, 180, 50);
            add(t3);

            tt3 = new TextField(20);
            tt3.setBounds(410, 250, 180, 50);
            add(tt3);

            ttt3 = new TextField(20);
            ttt3.setBounds(410, 150, 180, 50);
            add(ttt3);

            l3 = new Label("Age");
            add(l3);
            l3.setBounds(410, 100, 100, 50);

            t4 = new TextField(20);
            t4.setBounds(610, 350, 180, 50);
            add(t4);

            tt4 = new TextField(20);
            tt4.setBounds(610, 250, 180, 50);
            add(tt4);

            ttt4 = new TextField(20);
            ttt4.setBounds(610, 150, 180, 50);
            add(ttt4);

            l4 = new Label("Price");
            add(l4);
            l4.setBounds(610, 100, 100, 50);

            b1 = new Button("Update ALL");
            b1.setBounds(810, 250, 180, 50);
            add(b1);

            tt1.setText(rr1);
            tt2.setText(rr2);
            tt3.setText(rr3);
            tt4.setText(rr4);

            ttt1.setText(pp1);
            ttt2.setText(pp2);
            ttt3.setText(pp3);
            ttt4.setText(pp4);

            t1.setText(ss1);
            t2.setText(ss2);
            t3.setText(ss3);
            t4.setText(ss4);

            b1.addActionListener(this);

        }

        public void actionPerformed(ActionEvent ae) {
            rr1 = tt1.getText();
            rr2 = tt2.getText();
            rr3 = tt3.getText();
            rr4 = tt4.getText();

            pp1 = ttt1.getText();
            pp2 = ttt2.getText();
            pp3 = ttt3.getText();
            pp4 = ttt4.getText();

            ss1 = t1.getText();
            ss2 = t2.getText();
            ss3 = t3.getText();
            ss4 = t4.getText();
            dispose();

        }
    }

    class PetDelete extends Frame implements ActionListener {
        TextField t1, t2, t3, t4, tt1, tt2, tt3, tt4, ttt1, ttt2, ttt3, ttt4;
        Label l1, l2, l3, l4;
        Button b1, b2, b3, b4;

        PetDelete(String title) {
            super(title);
            MyWindowAdapter12 adapter = new MyWindowAdapter12(this);
            addWindowListener(adapter);
            setLayout(null);

            Font f = new Font("Monospaced", Font.BOLD, 20);
            setFont(f);

            t1 = new TextField(20);
            t1.setBounds(10, 350, 180, 50);
            add(t1);

            tt1 = new TextField(20);
            tt1.setBounds(10, 250, 180, 50);
            add(tt1);

            ttt1 = new TextField(20);
            ttt1.setBounds(10, 150, 180, 50);
            add(ttt1);

            l1 = new Label("Name");
            add(l1);
            l1.setBounds(10, 100, 100, 50);

            t2 = new TextField(20);
            t2.setBounds(210, 350, 180, 50);
            add(t2);

            tt2 = new TextField(20);
            tt2.setBounds(210, 250, 180, 50);
            add(tt2);

            ttt2 = new TextField(20);
            ttt2.setBounds(210, 150, 180, 50);
            add(ttt2);

            l2 = new Label("Category");
            add(l2);
            l2.setBounds(210, 100, 100, 50);

            t3 = new TextField(20);
            t3.setBounds(410, 350, 180, 50);
            add(t3);

            tt3 = new TextField(20);
            tt3.setBounds(410, 250, 180, 50);
            add(tt3);

            ttt3 = new TextField(20);
            ttt3.setBounds(410, 150, 180, 50);
            add(ttt3);

            l3 = new Label("Age");
            add(l3);
            l3.setBounds(410, 100, 100, 50);

            t4 = new TextField(20);
            t4.setBounds(610, 350, 180, 50);
            add(t4);

            tt4 = new TextField(20);
            tt4.setBounds(610, 250, 180, 50);
            add(tt4);

            ttt4 = new TextField(20);
            ttt4.setBounds(610, 150, 180, 50);
            add(ttt4);

            l4 = new Label("Price");
            add(l4);
            l4.setBounds(610, 100, 100, 50);

            b1 = new Button("Delete3");
            b1.setBounds(810, 350, 180, 50);
            add(b1);

            b2 = new Button("Delete2");
            b2.setBounds(810, 250, 180, 50);
            add(b2);

            b3 = new Button("Delete1");
            b3.setBounds(810, 150, 180, 50);
            add(b3);

            b4 = new Button("Delete All");
            b4.setBounds(1090, 250, 180, 50);
            add(b4);

            tt1.setText(rr1);
            tt2.setText(rr2);
            tt3.setText(rr3);
            tt4.setText(rr4);

            ttt1.setText(pp1);
            ttt2.setText(pp2);
            ttt3.setText(pp3);
            ttt4.setText(pp4);

            t1.setText(ss1);
            t2.setText(ss2);
            t3.setText(ss3);
            t4.setText(ss4);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);

        }

        public void actionPerformed(ActionEvent ae) {
            String str = ae.getActionCommand();
            if (str == "Delete1") {
                pp1 = "";
                pp2 = "";
                pp3 = "";
                pp4 = "";
                dispose();
            } else if (str == "Delete2") {
                rr1 = "";
                rr2 = "";
                rr3 = "";
                rr4 = "";
                dispose();
            } else if (str == "Delete3") {
                ss1 = "";
                ss2 = "";
                ss3 = "";
                ss4 = "";
                dispose();
            } else if (str == "Delete All") {
                rr1 = "";
                rr2 = "";
                rr3 = "";
                rr4 = "";

                pp1 = "";
                pp2 = "";
                pp3 = "";
                pp4 = "";

                ss1 = "";
                ss2 = "";
                ss3 = "";
                ss4 = "";
                dispose();
            }

        }
    }

    class About1 extends Frame implements ActionListener {
        Button a1, b1;
        Image img1;

        About1(String title) {

            super(title);

            MyWindowAdapter5 adapter = new MyWindowAdapter5(this);
            addWindowListener(adapter);

            Font f = new Font("Monospaced", Font.BOLD, 23);
            setFont(f);

            setLayout(new BorderLayout());
            add(new Button("ABOUT US"), BorderLayout.NORTH);

            add(new Label(""), BorderLayout.SOUTH);

            add(new Button("NEXT"), BorderLayout.EAST);

            add(new Button("BACK"), BorderLayout.WEST);

            String msg = "A pet shop or pet store is a retail business which sells different kinds of animals to the public. "
                    + "\nA variety of animal supplies and pet accessories are also sold in pet shops. "
                    + "\nThe products sold include: food, treats, toys, collars, leashes, cat litter, "
                    + "\ncages and aquariums. Some pet stores provide engraving services for pet tags,"
                    + "\nwhich have the owner's contact information in case the pet gets lost."
                    + "\nA major concern with pet stores and the reason why puppies and kittens may not be sold\n\n"
                    + " - Anilect Jose\n\n";

            add(new TextArea(msg), BorderLayout.CENTER);

        }

        public void actionPerformed(ActionEvent ae) {
            String str = ae.getActionCommand();
            if (str == "BACK") {
                this.setVisible(false);
                Frame f;
                f = new gas("********  ENTER YOUR INFORMATION  *******");
                f.setVisible(false);
                f.setSize(1500, 1000);
            } else if (str == "NEXT") {
                Frame f;
                f = new gas("********  ENTER YOUR INFORMATION  *******");
                f.setVisible(false);
                f.setSize(1500, 1000);
            }
        }

        public void paint(Graphics g) {

            // g.drawImage(img1,0,0,1366,768,this);
        }

    }

    class MyWindowAdapter5 extends WindowAdapter {
        About1 abt1;

        public MyWindowAdapter5(About1 abt1) {
            this.abt1 = abt1;
        }

        public void windowClosing(WindowEvent we) {
            abt1.setVisible(false);
        }
    }

    class MyWindowAdapter7 extends WindowAdapter {
        gas ss1;

        public MyWindowAdapter7(gas ss1) {
            this.ss1 = ss1;
        }

        public void windowClosing(WindowEvent we) {
            ss1.setVisible(false);
        }
    }

    class MyWindowAdapter12 extends WindowAdapter {
        PetDelete ex2;

        public MyWindowAdapter12(PetDelete ex2) {
            this.ex2 = ex2;
        }

        public void windowClosing(WindowEvent we) {
            ex2.setVisible(false);
        }
    }

    class MyWindowAdapter13 extends WindowAdapter {
        PetDisplay sd;

        public MyWindowAdapter13(PetDisplay sd) {
            this.sd = sd;
        }

        public void windowClosing(WindowEvent we) {
            sd.setVisible(false);
        }
    }

}
