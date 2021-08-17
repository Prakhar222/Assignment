package com.yash.newconcepts;
enum Season
{
	SPRING,
    SUMMER,
    AUTUMN,
    WINTER;
}
public class DemoEnum
{
    static Season Season;
  
    // Constructor
    public DemoEnum(Season season)
    {
        this.Season = season;
    }
  
    // Prints a line about Day using switch
    public void SeasonIsLike()
    {
        switch (Season)
        {
        case SPRING:
            System.out.println("SPRING");
            break;
        case AUTUMN:
            System.out.println("AUTUMN");
            break;
        case SUMMER:
        	 System.out.println("SUMMER");
             break;
        	
        case WINTER:
            System.out.println("WINTER");
            break;
        default:
            System.out.println("not selected");
            break;
        }
    }
  
    
     public static void main(String[] args)
    {
        String str = "SUMMER";
        DemoEnum t1 = new DemoEnum(Season.valueOf(str));
        t1.SeasonIsLike();
    }
}





