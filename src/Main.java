import GenericClass.MyGenericClass;
import Lambda.MyFrame;
import Lambda.MyInterface;
import innerClass.AnonymousInnerClass;
import openNewWindow.LaunchPage;
import serialization.User;

import java.io.*;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/




       /* Scanner scanner= new Scanner(System.in);

        System.out.println("what is your name");
        String name = scanner.nextLine();

        System.out.println("how old are you");
        int age = scanner.nextInt();

        scanner.nextLine(); // after nextInt() we add this

        System.out.println("what is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Hello "+ name);
        System.out.println("you are "+ age + " years old");
        System.out.println("your favorite food is: " + food);*/


//        int x= 10;
//        x= x/2;
//        System.out.println(x);


//         showing dialog box
//        String name= JOptionPane.showInputDialog("enter your name");
//        JOptionPane.showInputDialog(null, "your name is "+ name);
//        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
//        JOptionPane.showInputDialog(null, "your age is "+ age);
//        double height= Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
//        JOptionPane.showInputDialog(null, "you are "+ height + "tall");
//        System.out.println(age);



        //Math

//        double x = 3.14;
//        double y = -10;
//
//        double maximum = Math.max(x, y);
//        double minimun = Math.min(x, y);
//        double square = Math.sqrt(x);
//
//
//        System.out.println(maximum);
//        System.out.println(minimun);
//        System.out.println(square);
//        System.out.println(Math.round(x)); //round down
//        System.out.println(Math.round(x)); //round up






        //calculate hypotenuse
        /*double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        a= scanner.nextDouble();
        System.out.println("Enter side y: ");
        b= scanner.nextDouble();


        c= Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is" + c);

        scanner.close();*/







        //random
        /*Random random= new Random();
        int x = random.nextInt();
        double y= random.nextDouble();
        boolean z= random.nextBoolean();

        System.out.println(z);*/







        //if statement
        /*int age= 18;

        if ( age>= 18 ){
            System.out.println("you are an adult");
        } else if (age== 75) {
            System.out.println("you are 75");
        } else {
            System.out.println("you are not an adult");
        }*/








        //switch statement
        /*String day = "Friday";

        switch (day){
            case "Sunday": System.out.println("it is sunday");
            break;
            case "Monday": System.out.println("it is Monday");
            break;
            case "Friday" : System.out.println("it is Friday");
            break;
            default: System.out.println("that is nit a day");
        }*/







        /*int temp= 25;

        if (temp>= 30){
            System.out.println("it is hot");
        }else if (temp>= 20 && temp<=30){
            System.out.println("it is warm outside");
        }else {
            System.out.println("it is cold outside");
        }*/


//        Scanner scanner= new Scanner(System.in);
//
//        String name= "";
//
//        while (name.isBlank()){
//            System.out.println("enter your name");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("hello" + name);






        //nested loop

       /* Scanner scanner= new Scanner(System.in);
        int rows;
        int columns;
        String symbol= "";

        System.out.println("Enter number of rows: ");
        rows= scanner.nextInt();

        System.out.println("Enter number of columns ");
        columns= scanner.nextInt();

        System.out.println("Enter symbol to use");
        symbol= scanner.next();


        for (int i = 1; i<=rows; i++){
            System.out.println();
            for (int j = 1; j<= columns; j++){
                System.out.print(symbol);
            }
        }*/







        //array
//        String[] cars= {"car1","car2","car3"};
//        cars[0]= "car0";
//        System.out.println(cars[0]);

            //or

        /*String[] carsList = new String[3];
        carsList[0] = "car1";
        carsList[1] = "car2";
        carsList[2] = "car3";

        for (int i= 0; i<carsList.length; i++){
            System.out.println(carsList[i]);
        }*/







        // 2d array
      /*  String[][] cars2dList = new String[3][3];

        cars2dList[0][0] = "car1";
        cars2dList[0][1] = "car2";
        cars2dList[0][2] = "car3";

        cars2dList[1][0] = "car4";
        cars2dList[1][1] = "car5";
        cars2dList[1][2] = "car6";

        cars2dList[2][0] = "car7";
        cars2dList[2][1] = "car8";
        cars2dList[2][2] = "car9";*/

        //or

        /*String[][] cars2dList = {
                {"car1", "car2","car3"},
                {"car4", "car5","car6"},
                {"car7", "car8", "car9"},
        };

        for (int i= 0; i< cars2dList.length; i++){
            System.out.println();
            for (int j= 0; j<cars2dList[i].length; j++){
                System.out.print(cars2dList[i][j]+ " ");
            }


        }*/



        //string methods

       /* String name = "Farshad";

        boolean result = name.equals("farshad");
        boolean result1 = name.equalsIgnoreCase("farshad");
        int result2 = name.length();
        char result3 = name.charAt(0);
        int result4= name.indexOf("a");
        boolean result5= name.isEmpty();
        String result6= name.toUpperCase();
        String result7= name.toLowerCase();
        String result8= name.trim(); //removes the empty space
        String result9= name.replace('a','b');



        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);*/




        //ArrayList

        /*ArrayList<String> food= new ArrayList<String>();

        food.add("pizza");
        food.add("hotdog");
        food.add("hamburger");

        food.set(0, "suchi");
        food.remove(2);
        food.clear();

        for (int i= 0; i <food.size(); i++){
            System.out.println(food.get(i));
        }*/


        //2D ArrayList

       /* ArrayList<String> bakeryList= new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic");
        bakeryList.add("donuts");

        ArrayList<String> produceList= new ArrayList<>();
        produceList.add("tomato");
        produceList.add("zucchini");
        produceList.add("pepper");


        ArrayList<String> drinkList= new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("cocacola");


        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.print(groceryList);

        System.out.println(groceryList.get(0).get(1));*/





        //for each

        /*String[] names = {"taghi", "naghi", "mamad"};

        for (String i : names){
            System.out.println(i);
        }*/




        // java methods

        /*System.out.println(
                hello(
                        "salam",
                        "chetori"
                )
        );*/








        //objects

//        Car myCar= new Car();
//
//        System.out.println(myCar.color);
//
//        Human human1= new Human("taghi", 21, 86.3);
//        Human human2= new Human("naghi", 25, 59.2);
//
//        System.out.println(human1.weight);
//        human1.eat();

 //       DiceRoller diceRoller= new DiceRoller();


//        Pizza pizza= new Pizza(
//                "bugget",
//                "tomato",
//                "mozzarela",
//                "peperoni"
//        );
//
//        Pizza pizza2= new Pizza(
//                "bugget",
//                "tomato",
//                "mozzarela"
//        );
//
//        Pizza pizza3= new Pizza(
//                "bugget",
//                "tomato"
//        );

//        Car car= new Car();
//        System.out.println(car);




     /*   Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("fish");

        Food[] refrigerator = {food1, food2, food3};

        System.out.println(refrigerator[0].name);*/


//        Car1 car1= new Car1("BMW");
//        Car1 car2= new Car1("tesla");
//
//        Garage garage= new Garage();
//
//        garage.park(car1);
//        garage.park(car2);


//        Car1 car1= new Car1("bob");
//        Car1 car2= new Car1("taghi");
//        Car1 car3= new Car1("naghi");
//
//        System.out.println(Car1.numberOfCars);


//        Car car = new Car();
//        car.go();
//        System.out.println(car.doors);
//
//        Bicycle bicycle= new Bicycle();
//        System.out.println(bicycle.numberOfWheels);


      /*  Hero hero= new Hero(
                "taghi",
                22,
                "laser"
        );

        System.out.println(hero.toString());*/


       /* Rabbit rabbit= new Rabbit();
        rabbit.flee();

        Hawk hawk= new Hawk();
        hawk.hunt();


        Fish fish= new Fish();
        fish.flee();
        fish.hunt();*/





        // java gui

   /*     JFrame frame= new JFrame();
        frame.setTitle("title is here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon image= new ImageIcon("src/bingo.png");
        frame.setIconImage(image.getImage());*/

       // frame.getContentPane().setBackground(new Color(20,42,25));






        //java labels
     /*   ImageIcon image= new ImageIcon("images.png");

        Border border= BorderFactory.createLineBorder(Color.GREEN,3);
        JLabel label= new JLabel();
        label.setText("how are you doing");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.CYAN);
        label.setFont(new Font("MV Boli", Font.PLAIN,30));
        label.setIconTextGap(-25);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,250,250);



        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();*/






        //java panels


        /*ImageIcon icon = new ImageIcon(new ImageIcon("src/witchhat.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        JLabel label= new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,250,250);




        JPanel redPanel= new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);


        JPanel bluePanel= new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        redPanel.setLayout(null);

        JPanel greenPanel= new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        redPanel.setLayout(null);




        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);*/








        // java button
        //new MyButton();





        //border layout
        //new BorderLayout();






        //flow layout
        //new FlowLayout();






        //grid layout
        //new Gridlayout();



        //layered pane
        //new LayeredPane();



        //launch new window
        //new LaunchPage();




        //dialog box
        //new DialogBox();



        //textfield
        //new Textfield();


        //checkBox
        //new CheckBox();



        //radio button
        //new RadioButton();


        //comboBox
        //new ComboBox();




        //hashmap
//        canILiveHere(Planet.PLANET1);
//
//        HashMap<String, String> countries= new HashMap<String, String>();
//
//        countries.put("usa", "washington DC");
//        countries.put("iran", "tehran");
//
//
//
//        System.out.println(countries.get("iran"));
//        System.out.println(countries.size());
//
//        countries.replace("usa", "michigan");
//
//        System.out.println(countries.get("usa"));
//
//        countries.containsKey("england");





        /*MyInterface myInterface = (x, c) ->{
            System.out.println("hello world");
            System.out.println("it is s good day " + x + c);
        };


        myInterface.message("taghi", '!');*/





        //generics
        /*MyGenericClass<Integer> myInt= new MyGenericClass<>(1);
        MyGenericClass myDouble= new MyGenericClass("taghi");


        System.out.println(myDouble.getValue());*/







        //serialization

//        User user = new User();
//
//        user.name="farshad";
//        user.password="hallo";
//
//        FileOutputStream fileOut = new FileOutputStream("src/serialization/UserInfo.ser");
//        ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        out.writeObject(user);
//        out.close();
//        fileOut.close();
//
//        System.out.println("saved! ");




        //de-serialization

        User user= null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\serialization\\UserInfo.ser");
        ObjectInputStream in= new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();






























    }











    static String hello(String word1, String word2){
        return word1 + " "+ word2 ;
    }


//    static void canILiveHere(Planet planet){
//        switch (planet){
//            case PLANET1 -> System.out.println("you can live here");
//            case PLANET2 -> System.out.println("you can not live here");
//            default -> System.out.println("this is the default output");
//        }
//    }





}