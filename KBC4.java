import java.util.*;
public class KBC4
{
    public void q4()
    {
        int q,t=0,m=0,nil=0,ch,rop=0,lop,op=5,qn=0,l=0,lop1=0,ch1;
        String name;
        boolean ans=false,ll1=false,ll2=false,ll3=false, ll4=false;
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO KAUN BANEGA CROREPATI!");
        System.out.print("Please enter your name : ");
        name = in.nextLine();
        System.out.println("Press (1) to START or Press (2) to QUIT");
        ch = in.nextInt();
        switch(ch)
        {
            case 1:
                for(q=1;q<=17; q++,ans=false,op=0,rop=0,lop=0,l=0)
                {
                    //question 1
                    if(q==1)
                    {
                        m=1000;
                        System.out.println("1. At which of these places would you perform the 'backstroke', 'freestyle' and 'butterfly'?");
                        System.out.println("(1) : Swimming pool (2) : Race Track \n(3): Football ground (4) : Tennis court");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 2
                    if(q==2)
                    {
                        m=2000;
                        System.out.println("2. Forks, spoons and knives are collectively called which of these?");
                        System.out.println("(1) : Stationery (2) : Drapery \n(3) : Cutlery (4) : Armoury");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 3
                    if(q==3)            
                    {
                        m=3000;
                        System.out.println("3. Which of these food items is also used to describe a shade of brown?");
                        System.out.println("(1) : Rasgulla (2) : Strawberry  \n(3) : Chocolate (4) : Ketchup");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    } 
                    //question 4
                    if(q==4)
                    {
                        m=5000;
                        System.out.println("4. If you are an RJ, where would you usually host a show?");
                        System.out.println("(1) : On TV (2) : In a disco \n(3) : On YouTube (4) : On the radio");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 5
                    if(q==5)
                    {
                        m=10000;
                        System.out.println("5. Which of these is not a district in Haryana?");
                        System.out.println("(1) : Meerut (2): Gurugram \n(3) : Hisar (4): Panipat");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 6
                    if(q==6)
                    {
                        m=20000;
                        System.out.println("6. Who among these was not a professor at Hogwarts in the Harry Potter books?");
                        System.out.println("(1) : Minerva McGonagall (2) : Pomona Sprout \n(3) : Filius Flitwick (4) : Sirius Black");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 7
                    if(q==7)
                    {
                        m=40000;
                        System.out.println("7. Which of these elements is named after the Japanese word for Japan?");
                        System.out.println("(1): Nihonium (2): Gallium \n(3): Ruthenium (4): Polonium");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 8
                    if(q==8)
                    {
                        m=80000;
                        System.out.println("8. Which popular writer is the mother-in-law of the man whose official residence is currently at 10 Downing Street?");
                        System.out.println("(1): Anita Desai (2): Sudha Murty \n(3): Shashi Deshpande (4): Chitra Banerjee Divakaruni");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 9
                    if(q==9)
                    {
                        m=160000;
                        System.out.println("9. PM Shri Narendra Modi talked about Kylian Mbappe's popularity in India during a visit to which country?");
                        System.out.println("(1): Italy (2): Germany \n(3): France (4): Australia");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 10
                    if(q==10)
                    {
                        m=320000;
                        System.out.println("10. Bubonic, septicemic and pneumonic are the forms of which disease?");
                        System.out.println("(1): Polio (2): Typhoid \n(3): Malaria (4): Plague");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 11
                    if(q==11)
                    {
                        m=640000;
                        System.out.println("11. A statue of who among the following, named 'Statue of Equality', was unveiled in Washington DC in 2023?");
                        System.out.println("(1) : Dr. B.R. Ambedkar (2) : Mahatma Gandhi \n(3): Abraham Lincoln (4): Martin Luther King Jr.");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 12
                    if(q==12)
                    {
                        m=1250000;
                        System.out.println("12. The flag of which of these countries does not have a depiction of a living creature on it?");
                        System.out.println("(1) : Uganda (2) : Papua New Guinea \n(3) : Philippines (4) : Ecuador");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 13
                    if(q==13)            
                    {
                        m=2500000;
                        System.out.println("13. Nandighosha and Taaladhwaja are some of the names of which of these?");
                        System.out.println("(1) : Caves on Amarnath Yatra (2) : Chariots during Puri rath yatra \n(3) : Gopurams of Tirupati temple (4) : Lakes on Mount Kailash");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    } 
                    //question 14
                    if(q==14)
                    {
                        m=5000000;
                        System.out.println("14. Which of these was the first satellite launched by France named after?");
                        System.out.println("(1) : A toy (2) : A comics character \n(3) : A pet dog (4) : A movie");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 15
                    if(q==15)
                    {
                        m=10000000;
                        System.out.println("15. Which European cartographer is credited with creating the map that gave the name 'America' to the newly discovered continent?");
                        System.out.println("(1) : Abraham Ortelius (2): Geradus Mercator \n(3) : Giovanni Battista Agnese (4): Martin Waldseemuller");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 16
                    

                    //life-line condition            
                    if(op==5)
                    {
                        op=nil;
                        for( l = 0;l!=1;)
                        {
                            System.out.println("Press (1): 50-50 options (2): Computer's Poll (3): Answer without Life-Line");
                            lop=in.nextInt();
                            if(lop==1)
                            {
                                if(q==1 && ll1==false)
                                {
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Swimming pool (2) : Race Track");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==2 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("\n(3) : Cutlery (4) : Armoury");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("               (2) : Strawberry  \n(3) : Chocolate");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("\n(3) : On YouTube (4) : On the radio");
                                    op=in.nextInt();
                                    break;}
                                else if(q==5 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Meerut\n            (4): Panipat");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("\n(3) : Filius Flitwick (4) : Sirius Black");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Nihonum\n              (4): Polonium");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("                  (2): Sudha Murty \n(3): Shashi Deshpande");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("            (2): Germany \n(3): France");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("\n(3): Malaria (4): Plague");
                                    op=in.nextInt();
                                    break;}
                                else if(q==11 && ll1==false)
                                {
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Dr. B.R. Ambedkar (2) : Mahatma Gandhi");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==12 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("             (2) : Papua New Guinea \n(3) : Philippines");
                                    op=in.nextInt();
                                    break;}
                                else if(q==13 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Caves on Amarnath Yatra (2) : Chariots during Puri rath yatra");
                                    op=in.nextInt();
                                    break;}
                                else if(q==14 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : A comics character \n                (4) : A movie");
                                    op=in.nextInt();
                                    break;}
                                else if(q==15 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("\n(3) : Giovanni Battista Agnese (4): Martin Waldseemuller");
                                    op=in.nextInt();
                                    break;}
    
                                else{
                                    System.out.println("THIS LIFE-LINE IS ALREADY USED");
                                    continue;
                                }
                            }

                            if(lop==2){
                                if(q==1 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 60% (2): 5% \n(3): 20% (4): 15%");
                                    op=in.nextInt();
                                    break;}

                                else if(q==2 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 25% (2): 6% \n(3): 55% (4): 14%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 30% (2): 10% \n(3): 45% (4): 15%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 5% (2): 10% \n(3): 10% (4): 75%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==5 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 80% (2): 2% \n(3): 6% (4): 12%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 15% (2): 10% \n(3): 5% (4): 70%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 60% (2): 6% \n(3): 20% (4): 14%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 15% (2): 50% \n(3): 25% (4): 10%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 8% (2): 12% \n(3): 65% (4): 15% ");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 8% (2): 15% \n(3): 8% (4): 69%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==11 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 60% (2): 20% \n(3): 5% (4): 15%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==12 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 12% (2): 2% \n(3): 58% (4): 28%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==13 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 15% (2): 45% \n(3): 30% (4): 10%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==14 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 5% (2): 75% \n(3): 10% (4): 10%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==15 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 6% (2): 2% \n(3): 12% (4): 80%");
                                    op=in.nextInt();
                                    break;}
                                
                                else{
                                    System.out.println("THIS LIFE-LINE IS ALREADY USED");
                                    continue;}}
                                    
                                    

                            
                    

                            if(lop==3){
                                l=1;
                                op=in.nextInt();
                                break;}

                        }}
                    if(op==rop){
                        ans=true;
                        t=m;}
                    else
                        ans=false;

                    if(ans ==true){
                        System.out.println("CORRECT ANSWER!");
                        
                        System.out.println("YOU WON Rs." + m);
                        if(q==15){
                            System.out.println("CONGRATULATIONS " + name + " ! YOU WON Rs. " + t);
                            System.out.println("THANK YOU!");
                            System.exit(0);
                        }
                            
                        continue;

                    }
                    else{
                        System.out.println("OOPS! I AM AFRAID THAT'S THE WRONG ANSWER.");
                        ans=false;
                        System.out.println("THE CORRECT ANSWER WAS OPTION(" + rop + ")");
                        System.out.println("HENCE, " + name + ", YOU HAVE WON TOTAL Rs." + t);
                        System.out.println("THANK YOU!");
                        break;}
                }
                //common condition   

                break;
            case 2:
                System.out.println("THANK YOU!");
                System.exit(0);

            default:
                System.out.println("INVALID CHOICE");
        }
    }
}