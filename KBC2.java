import java.util.*;
class KBC2
{
    public void q2()
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
                        System.out.println("1. Which of these would you associate with the Bengali delicacy known as malai curry ?");
                        System.out.println("(1) : Cabbage (2) : Prawn \n(3): Pomfret (4) : Mutton");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 2
                    if(q==2)
                    {
                        m=2000;
                        System.out.println("2. On which of these occassions would you most likely to wish someone a 'Happy New Year'?");
                        System.out.println("(1) : Morning, 25th December (2) : Midnight, 31st December \n(3) : Afternoon, 26th January (4) : Evening, 1st March");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 3
                    if(q==3)            
                    {
                        m=3000;
                        System.out.println("3. Which of these activities involves walking?");
                        System.out.println("(1) : Bungee Jumping (2) : Parasailing \n(3) : Skydiving (4) : Trekking");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    } 
                    //question 4
                    if(q==4)
                    {
                        m=5000;
                        System.out.println("4. Complete this proverb meaning one who does daring tasks '------ ke gale mein ghanti bandhna'?");
                        System.out.println("(1) : Gadha (2) : Gaay \n(3) : Khargosh (4) : Billi");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 5
                    if(q==5)
                    {
                        m=10000;
                        System.out.println("5. Which of these elements is equipped with certain elements called teeth?");
                        System.out.println("(1) : Iron (2): Comb \n(3) : Mirror (4): Spoon");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 6
                    if(q==6)
                    {
                        m=20000;
                        System.out.println("6. From which country, that has a well known football team, did Brazil gain its independence?");
                        System.out.println("(1) : Spain (2) : Italy \n(3) : Portugal (4) : France");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 7
                    if(q==7)
                    {
                        m=40000;
                        System.out.println("7. Which is the only South American nation to be a member of the BRICS group?");
                        System.out.println("(1): Peru (2): Argentina \n(3): Brazil (4): Uruguay");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 8
                    if(q==8)
                    {
                        m=80000;
                        System.out.println("8. What does OTT, used to refer to online straming platforms, stand for ?");
                        System.out.println("(1): On Telecast Time (2): Only to Test \n(3): Over The Top (4): On Television Track");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 9
                    if(q==9)
                    {
                        m=160000;
                        System.out.println("9. Tennis players of which of these nationalities were baned from the 2022 Wimbledon tennis championships due to the Ukraine War?");
                        System.out.println("(1): Chinese  (2): Kazakhastani \n(3): Georgian (4): Russian");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 10
                    if(q==10)
                    {
                        m=320000;
                        System.out.println("10. Olaf cholz replaced Angela Merkel as the Chancellor of which European country in 2021?");
                        System.out.println("(1): Spain (2): Germany \n(3): France (4): Italy");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 11
                    if(q==11)
                    {
                        m=640000;
                        System.out.println("11. The 'unicornis' part in the scientific name of the Indian rhinoceros, which is Rhinoceros unicornis, refers to which feature of the animal?");
                        System.out.println("(1) : It eats only one kind of grass (2) : It is found only in one country \n(3): It has one horn (4): It can run fast");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 12
                    if(q==12)
                    {
                        m=1250000;
                        System.out.println("12. The Ken - Betwa river linking project will connect tributaries of which river?");
                        System.out.println("(1) : Godavari (2) : Yamuna \n(3) : Narmada (4) : Jhelum");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 13
                    if(q==13)            
                    {
                        m=2500000;
                        System.out.println("13. The First Three recipients of Bharat Ratna were all born in towns located in which present day state?");
                        System.out.println("(1) : Uttar Pradesh (2) : Karnataka \n(3) :Gujarat (4) : Tamil Nadu");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    } 
                    //question 14
                    if(q==14)
                    {
                        m=5000000;
                        System.out.println("14. Which institution develops and maintains the National Digital Library of India?");
                        System.out.println("(1) : Indian Institute of Science (2) : IIT Kharagpur \n(3) : Jawaharlal Nehru University (4) : APJ Abdul Kalam Technological University");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 15
                    if(q==15)
                    {
                        m=10000000;
                        System.out.println("15. Which stupa in Uttar Pradesh is believed to commemorate Gautama Buddha's first sermon after enlightment?");
                        System.out.println("(1) : Chaukhandi Stupa (2): Sujata Stupa \n(3) : Dhamek Stupa (4): Dhauli Stupa");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
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
                                    System.out.println("(2) : Prawn \n(3): Pomfret");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==2 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Morning, 25th December (2) : Midnight, 31st December");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Bungee Jumping\n               (4) : Trekking");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Gadha\n              (4) : Billi");
                                    op=in.nextInt();
                                    break;}
                                else if(q==5 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Iron (2): Comb");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("\n(3) : Portugal (4) : France");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): Argentina \n(3): Brazil");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): Only to Test \n(3): Over The Top");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Chinese\n              (4): Russian");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): Germany \n(3): France");
                                    op=in.nextInt();
                                    break;}
                                else if(q==11 && ll1==false)
                                {
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : It is found only in one country \n(3): It has one horn");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==12 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : Yamuna \n(3) : Narmada");
                                    op=in.nextInt();
                                    break;}
                                else if(q==13 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : Karnataka \n             (4) : Tamil Nadu");
                                    op=in.nextInt();
                                    break;}
                                else if(q==14 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Indian Institute of Science (2) : IIT Kharagpur");
                                    op=in.nextInt();
                                    break;}
                                else if(q==15 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): Sujata Stupa \n(3) : Dhamek Stupa");
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
                                    System.out.println("(1): 20% (2): 60% \n(3): 5% (4): 15%");
                                    op=in.nextInt();
                                    break;}

                                else if(q==2 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 25% (2): 55% \n(3): 6% (4): 14%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 30% (2): 10% \n(3): 15% (4): 45%");
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
                                    System.out.println("(1): 2% (2): 80% \n(3): 6% (4): 12%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 15% (2): 10% \n(3): 70% (4): 5%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 20% (2): 6% \n(3): 60% (4): 14%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 15% (2): 25% \n(3): 50% (4): 10%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 8% (2): 12% \n(3): 15% (4): 65% ");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1):8% (2): 69% \n(3): 8% (4): 15%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==11 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 5% (2): 20% \n(3): 60% (4): 15%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==12 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 14% (2): 55% \n(3): 6% (4): 25%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==13 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 15% (2): 10% \n(3): 30% (4): 45%");
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
                                    System.out.println("(1): 6% (2): 2% \n(3): 80% (4): 12%");
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