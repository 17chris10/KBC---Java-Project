import java.util.*;
class KBC1
{
    public void q1()
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
                        System.out.println("1. Which festival will complete this line : 'Bura na mano ________ hai'?");
                        System.out.println("(1) : Diwali (2) : Bakri Id \n(3): Holi (4) : Dussehra");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 2
                    if(q==2)
                    {
                        m=2000;
                        System.out.println("2. From whom did Sarojini Naidu at the title 'Nightingale of India'?");
                        System.out.println("(1) : Mahatma Gandhi (2) : Pandit Jawaharlal Nehru \n(3) : Lord Mountbatten (4) : Dr. Rajendra Prasad");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 3
                    if(q==3)            
                    {
                        m=3000;
                        System.out.println("3. Who was the first female professional wrestler of Indian nationality to wrestle in WWE ?");
                        System.out.println("(1) : Geeta Phogat (2) : Kavita Devi \n(3) : Sakshi Malik (4) : Divya Kakran");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    } 
                    //question 4
                    if(q==4)
                    {
                        m=5000;
                        System.out.println("4. FROM WHICH MOVIE IS THIS DIALOGUE TAKEN 'I am the King of the World'?");
                        System.out.println("(1) : Titanic (2) : Minions - Rise of Gru \n(3) : Enola Holmes (4) : Finding Nemo");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 5
                    if(q==5)
                    {
                        m=10000;
                        System.out.println("5. Who is known as the 'Missile Man of India'?");
                        System.out.println("(1) : K. Radhakrishnan (2): A.P.J. Abdul Kalam \n(3) : M. Annadurai (4): V.Adhimurthy");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 6
                    if(q==6)
                    {
                        m=20000;
                        System.out.println("6. Serum Institute of India, manufacturer of COVID - 19 vaccine Covishield, was founded by which business family ?");
                        System.out.println("(1) : Poonawala Family (2) : Burman Family \n(3) : Birla Family (4) : Reddy Family");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 7
                    if(q==7)
                    {
                        m=40000;
                        System.out.println("7. What does 'SE' stand for in 'SEO', a process to increase traffic to a website ?");
                        System.out.println("(1): Search Evolution (2): Simultaneous Expression \n(3): Silent Evolution (4): Search Engine");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 8
                    if(q==8)
                    {
                        m=80000;
                        System.out.println("8. Which common portfolio have Rajnath Singh, Nirmala Sitharaman and Arun Jaitley all held in the Union Cabinet ?");
                        System.out.println("(1): Home (2): Finance \n(3): Defence (4): Law & Justice");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=3;
                    }
                    //question 9
                    if(q==9)
                    {
                        m=160000;
                        System.out.println("9. In 2021, Anita Anand took charge as the Minister of National Defence of which country?");
                        System.out.println("(1): Canada  (2): Norway \n(3): United Kingdom (4): Fiji");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 10
                    if(q==10)
                    {
                        m=320000;
                        System.out.println("10. Nayanjot Lahiri, author of books such as 'The Decline and Fall of Indus Civilization', is known for her worl in which field?");
                        System.out.println("(1): Meteorology (2): Archaeology \n(3): Botany (4): Microbiology");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 11
                    if(q==11)
                    {
                        m=640000;
                        System.out.println("11. Who among these wrote under the pseudonym 'Ghanshyam Vyas'?");
                        System.out.println("(1) : K.M. Munshi (2) : Manubhai Pancholi \n(3): Umashankhar Joshi (4): Labhshankar Thakar");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=1;
                    }
                    //question 12
                    if(q==12)
                    {
                        m=1250000;
                        System.out.println("12. The news of which of these was announced in the papers in London on the day of coronation of Queen Elizabeth?");
                        System.out.println("(1) : Launch of Sputnik (2) : Moon Landing \n(3) : First heart transplant (4) : Summitting of Mt. Everest");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }
                    //question 13
                    if(q==13)            
                    {
                        m=2500000;
                        System.out.println("13. Who among these musicians of the Maihar Gharana has been the guru of the sitarist Nikhil Banerjee, and of the bansuri players Hari Prasad Chaurasia and Nithyanand Haldipur?");
                        System.out.println("(1) : Vasundhara Komakali (2) : Annapurna Devi \n(3) : Sunanda Patnaik (4) : Veena Sahastrabuddhe");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    } 
                    //question 14
                    if(q==14)
                    {
                        m=5000000;
                        System.out.println("14. Which of these films was cited as an inspiration by Danny Boyle for the Oscar - winning film Slumdog Millionaire?");
                        System.out.println("(1) : Baazigar (2) : Black Friday \n(3) : Shool (4) : Gangs of Wasseypur");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=2;
                    }
                    //question 15
                    
                    if(q==15)
                    {
                        m=10000000;
                        System.out.println("15. Which British Army Unit was given the motto 'Primus in Indis' because it was the first to serve in India ?");
                        System.out.println("(1): 41st (Welch) Regiment of Foot (2): 1st Coldstream Guards \n(3): 5th Light Infantry (4): 39th Regiment of Foot");
                        System.out.println("Press (5): To use Life-Line");
                        op=in.nextInt();
                        rop=4;
                    }

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
                                    System.out.println("(1): Diwali \n(3): Holi");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==2 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Mahatma Gandhi (2) : Pandit Jawaharlal Nehru");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : Kavita Devi \n(3) : Sakshi Malik");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Titanic (2) : Minions - Rise of Gru");
                                    op=in.nextInt();
                                    break;}
                                else if(q==5 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): A.P.J. Abdul Kalam \n(4): V.Adhimurthy");
                                    op=in.nextInt();
                                    break;}
                                else if(q==6 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : Poonawala Family \n(3) : Birla Family");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Search Evolution \n(4): Search Engine");
                                    op=in.nextInt();
                                    break;}
                                else if(q==8 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): Finance \n(3): Defence");
                                    op=in.nextInt();
                                    break;}
                                else if(q==9 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): Canada \n(3): United Kingdom");
                                    op=in.nextInt();
                                    break;}
                                else if(q==10 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2): Archaeology \n(4): Microbiology");
                                    op=in.nextInt();
                                    break;}
                                else if(q==11 && ll1==false)
                                {
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1) : K.M. Munshi (2) : Manubhai Pancholi");
                                    op=in.nextInt();
                                    break;
                                }
                                else if(q==12 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : Moon Landing \n(4) : Summitting of Mt. Everest");
                                    op=in.nextInt();
                                    break;}
                                else if(q==13 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : Annapurna Devi \n(3) : Sunanda Patnaik");
                                    op=in.nextInt();
                                    break;}
                                else if(q==14 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(2) : Black Friday \n(4) : Gangs of Wasseypur");
                                    op=in.nextInt();
                                    break;}
                                else if(q==15 && ll1==false){
                                    ll1=true;
                                    l=1;
                                    System.out.println("(1): 41st (Welch) Regiment of Foot \n(4): 39th Regiment of Foot");
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
                                    System.out.println("(1): 20% (2): 5% \n(3): 60% (4): 15%");
                                    op=in.nextInt();
                                    break;}

                                else if(q==2 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 55% (2): 25% \n(3): 6% (4): 14%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==3 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 30% (2): 45% \n(3): 15% (4): 10%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==4 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 75% (2): 10% \n(3): 10% (4): 5%");
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
                                    System.out.println("(1): 70% (2): 10% \n(3): 15% (4): 5%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==7 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 20% (2): 6% \n(3): 14% (4): 60%");
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
                                    System.out.println("(1): 65% (2): 12% \n(3): 15% (4): 8% ");
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
                                    System.out.println("(1): 60% (2): 20% \n(3): 5% (4): 15%");
                                    op=in.nextInt();
                                    break;}
                                else if(q==12 && ll2==false){
                                    ll2=true;
                                    l=1;
                                    System.out.println("(1): 14% (2): 25% \n(3): 6% (4): 55%");
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
                                    System.out.println("(1): 20% (2): 6% \n(3): 14% (4): 60%");
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
                        if(q==17){
                            System.out.println("CONGRATULATIONS " + name + " ! YOU WON Rs. " + t);
                            System.out.println("THANK YOU!");
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