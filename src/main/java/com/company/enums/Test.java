package com.company.enums;

enum Color
{
    RED, GREEN,
    BLUE{
        public String info(){
            return "Sky is Blue";
        }
    },
    GOLD{
        public String info(){
            return "GOLD IS COSTLY";
        }
    },
    BROWN;
    public String info(){
        return "Other Color";
    }
    // enum constructor called separately for each constant
    Color(){
        System.out.println("Constructor called for : " + this.toString());
    }
    // Only concrete (not abstract) methods allowed
    public void colorInfo(){
        System.out.println("Universal Color");
    }
}

public class Test
{
    Color color;
    public Test(Color color) {
        this.color = color;
    }
    public void colorSays()
    {
        switch (color)
        {
            case RED:
                System.out.println("RED color is for danger");
                break;
            case GREEN:
                System.out.println("Green color is for OK");
                break;
            case BLUE:
            default:
                System.out.println("Inside default switch case");
                break;
        }
    }

    public static void main(String[] args)
    {
        /*Color c1 = Color.RED;
        System.out.println("Fetching a enum value: " + c1);
        // Calling values()
        Color arr[] = Color.values();
        // enum with loop
        for (Color col : arr) {
            // Calling ordinal() to find index of color.
            System.out.println(col + " at index: " + col.ordinal() + ", info: " + col.info());
        }
        // Using valueOf(). Returns an object of Color with given constant.
        System.out.println(Color.valueOf("RED"));
        // Switch case
        Test t1 = new Test(Color.GREEN);
        t1.colorSays();*/
        //
        Color[] c2 = Color.values();
        System.out.println("Total enums: "+ c2.length);
        c2[1].colorInfo();
        for (Color c : c2){
            c.info();
            c.toString();
        }
    }
}





