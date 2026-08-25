import java.util.*;
class KBL
{
    public static void main(String agrs[])
    {
        int q,t=0,m=0,nil=0,ch,rop=0,lop,op=5,qn=0,l=0;
        boolean ans=false,ll1=false,ll2=false,ll3=false;
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO KAUN BANEGA CROREPATI!");
        System.out.println("Press (1) to START or Press (2) to QUIT");
        ch = in.nextInt();
        switch(ch)
        {
            case 1:
                for(q=1;q<=10; q++,ans=false,op=0,rop=0,lop=0,l=0)
                {
                    //question 1
                    if(q==1)
                    {
                        m=1000;
                        System.out.println("WHO WAS THE FIRST PRESIDENT OF INDIA?");
                        System.out.println("(1): Pandit Jawaharlal Nehru \n(2):Dr. B.R. Ambedkar \n(3): Dr. Rajendra Prasad \n(4): Mahatma Gandhi");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 2
                    if(q==2)
                    {
                        m=2500;
                        System.out.println("WHAT WERE THE 2020 OLYMPIC MEDALS MADE UP OF?");
                        System.out.println("(1): Metals and alloys  \n(2): Electronic Waste \n(3): Recycle Plastic \n(4): Paper and Cardboard");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 3
                    if(q==3)            
                    {
                        m=5000;
                        System.out.println("WHO COMPOSE THE NATIONAL SONG OF INDIA?");
                        System.out.println("(1): Sarojini Naidu  \n(2): R.K. Narayan \n(3): Rabindranath Tagore \n(4): Bankim Chandra Chattopadhyay");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    } 
                    //question 4
                    if(q==4)
                    {
                        m=10000;
                        System.out.println("WHO WAS THE FIRST WOMAN FROM INDIA TO GO TO MOON?");
                        System.out.println("(1): Kalpana Chawala  \n(2): Sirisha Bandla \n(3): Sunita Williams \n(4): Shawna Pandya");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 5
                    if(q==5)
                    {
                        m=25000;
                        System.out.println("WHOSE THE AUTHOR OF DAVID COPPERFIELD?");
                        System.out.println("(1): J.K. Rowling  \n(2): Charles Dickens \n(3): Jack London \n(4): Rudyard Kipling");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 6
                    if(q==6)
                    {
                        m=50000;
                        System.out.println("WHICH RENOWNED SINGER IS GIVEN THE TITLE OF 'Voice of the Millennium'?");
                        System.out.println("(1): Kishor Kumar  \n(2): Asha Bhosle \n(3): Lata Mangeshkar \n(4): M.S. Subbulakshmi");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 7
                    if(q==7)
                    {
                        m=100000;
                        System.out.println("WHO WON THE FIFA U-17 WOMEN'S WORLD CUP 2022?");
                        System.out.println("(1): Spain  \n(2): Argentina \n(3): Columbia \n(4): Croatia");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 8
                    if(q==8)
                    {
                        m=250000;
                        System.out.println("FROM WHICH MOVIE IS THIS DIALOGUE TAKEN FROM 'Har team main bas ek hi gunda ho sakta hai aur is team ka gunda main hoon'?");
                        System.out.println("(1): Players  \n(2): Race 3 \n(3): Chak De India \n(4): Dangal");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 9
                    if(q==9)
                    {
                        m=500000;
                        System.out.println("WHICH OF THE FOLLOWING IS NOT A SHOOTING GAME?");
                        System.out.println("(1): Counter Strike  \n(2): Overwatch \n(3): Call of Duty \n(4): Grand Theft Auto");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 10
                    if(q==10)
                    {
                        m=1000000;
                        System.out.println("WHICH IS THE OLDEST RELIGION IN THE WORLD?");
                        System.out.println("(1): Chrisanity  \n(2): Islam \n(3): Hinduism \n(4): Jainism");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }

                    //life-line condition            
                    if(op==5)
                    {
                        op=nil;
                        for( l = 0;l!=1;)
                        {
                            System.out.println("Press (1):50-50 options (2):Computer's Poll (3): Double Dip (4):Answer without Life-Line");
                            lop=in.nextInt();
                            if(lop==1)
                            {
                                if(q==1 && ll1==false)
                                {
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Pandit Jawaharlal Nehru \n(2):____ \n(3): Dr.Rajendra Prasad \n(4):____");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==2 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Metals and alloys \n(2): Electronics Waste \n(3):____ \n(4):____");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1):____ \n(2):____ \n(3): Rabindranath Tagore \n(4): Bankim Chandra Chattopadhyay");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Kalpana Chawala \n(2):____ \n(3):____ \n(4): Shawna Pandya");
                                    op=in.nextInt();
                                    break;}
                                else if(q==5 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1):____ \n(2): Charles Dickens \n(3):____ \n(4): Rudyard Kipling");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Kishor Kumar \n(2):____ \n(3): Lata Mangeshkar \n(4):____");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Spain \n(2):____ \n(3): Columbia \n(4):____");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1):____ \n(2): Race 3 \n(3): Chak De India \n(4):____");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1):____ \n(2): Overwatch \n(3):____ \n(4): Grand Theft Auto ");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1):Chrisanity \n(2):____ \n(3): Hinduism \n(4):____");
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
                                    System.out.println("(1): 92% \n(2): 60% \n(3): 95% \n(4): 75%");
                                    op=in.nextInt();
                                    break;}

                                else if(q==2 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 90% \n(2): 91.5% \n(3): 63% \n(4): 10%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 60% \n(2): 80% \n(3): 96% \n(4): 98%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 92% \n(2): 90% \n(3): 85% \n(4): 86.5%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==5 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 84% \n(2): 95% \n(3): 85% \n(4): 85%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 89.5% \n(2): 85% \n(3): 91% \n(4): 75%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 95% \n(2): 65% \n(3): 92% \n(4): 79%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 68% \n(2): 94.5% \n(3): 95% \n(4): 86%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 65%  \n(2): 92% \n(3): 84% \n(4): 93.5% ");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1):78% \n(2): 69% \n(3): 95% \n(4): 94.5%");
                                    op=in.nextInt();
                                    break;}
                                else{
                                    System.out.println("THIS LIFE-LINE IS ALREADAY USED");
                                    continue;}}

                            if(lop==3){

                                ll3=true;
                                l=1;
                                System.out.println("Enter your Choice");
                                op=in.nextInt();
                                if(op!=rop)
                                {
                                    System.out.println("INCORRECT ANSWER! HOWEVER, YOU CAN TRY AGAIN!");
                                    op=0;
                                    op=in.nextInt();
                                }

                                else{
                                    System.out.println("THIS LIFE-LINE IS ALREADAY USED");
                                    continue;}}

                            if(lop==4){
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
                        if(q==10)
                            System.out.println("CONGRATULATIONS YOU WON Rs. " + t);
                        continue;

                    }
                    else{
                        System.out.println("INCORRECT ANSWER!");
                        ans=false;
                        System.out.println("YOU HAVE WON TOTAL Rs." + t);
                        break;}
                }
                //common condition   

                break;
            case 2:
                System.out.println("THANK YOU!");
                System.exit(0);

            default:
                System.out.println("INVALID CHOICE");}
    }
}