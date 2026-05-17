import java.util.Scanner;

public class NokiaMenu{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        while (true){
            System.out.printf("%n       MAIN MENU        %n");
            System.out.printf("1. Phone book%n2. Messages%n3. Chat%n4. Call register%n5. Tones%n6. Settings%n7. Call divert%n8. Games%n9. Calculator%n10. Reminders%n11. Clock%n12. Profiles%n13. SIM services%n0. Exit%n%n");
            System.out.println("Enter value 0 - 13");
            
            int mainMenuChoice = input.nextInt();
            switch (mainMenuChoice){

            case 1: // L1   PHONE BOOK
                while(true){
                    System.out.printf("%n        PHONE BOOK      %n");
                    System.out.printf("1. Search%n2. Service Nos%n3. Add name%n4. Erase%n5. Edit%n6. Assign tone%n7. Send b'card%n8. Options%n9. Speed dials%n10. Voice tags%n0. Back%n");
                    int subMenuChoice = input.nextInt();
                    switch (subMenuChoice){
                    
                    case 1: // L2   SEARCH
                        //while(true){
                            System.out.println("%n      SEARCH        %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice1 = input.nextInt();
                            //switch (subSubMenuChoice){
                              //  case 0:
                                //    break;
                                //default:
                                 //   System.out.printf("Invalid choice!%n"); 
                
                            //}
                            if (subSubMenuChoice1 == 0) break;
                            else {System.out.printf("Invalid choice!%n");}
                        //for while loop}
                        break;

                    case 2: // L2   SERVICE NOS
                        while(true){
                            System.out.println("%n      SERVICE NOs     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 3: //  L2  ADD NAME
                        while(true){
                            System.out.println("%n      ADD NAME     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 4: //  L2  ERASE
                        while(true){
                            System.out.println("%n      ERASE     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 5: //  L2  EDIT
                        while(true){
                            System.out.println("%n      EDIT     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 6: //  L2  ASSIGN TONE
                        while(true){
                            System.out.println("%n      ASSIGN TONE     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 7: //  L2  SEND B' CARD'
                        while(true){
                            System.out.println("%n      SEND B' CARD     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                   case 8: // OPTIONS
                        while (true) {
                            System.out.printf("%n      OPTIONS     %n");
                            System.out.printf("1. Type of view%n2. Memory status%n0. Back%n");

                            int subSubMenuChoice = input.nextInt();

                            switch (subSubMenuChoice) {

                                case 1: // TYPE OF VIEW
                                    while (true) {
                                        System.out.printf("%n      TYPE OF VIEW     %n");
                                        System.out.printf("0. Back%n");

                                        int subSubSubMenuChoice = input.nextInt();

                                        if (subSubSubMenuChoice == 0) break;
                                        else System.out.printf("Invalid choice!%n");
                                    }
                                    break;

                                case 2: // MEMORY STATUS
                                    while (true) {
                                        System.out.printf("%n      MEMORY STATUS     %n");
                                        System.out.printf("0. Back%n");

                                        int subSubSubMenuChoice = input.nextInt();

                                        if (subSubSubMenuChoice == 0) break;
                                        else System.out.printf("Invalid choice!%n");
                                    }
                                    break;

                                case 0:
                                    break;

                                default:
                                    System.out.printf("Invalid choice!%n");
                            }

                            if (subSubMenuChoice == 0) break;
                        }
                        break;
                                

                    case 9: //  L2  SPEED DIALS
                        while(true){
                            System.out.println("%n      SPEED DIALS     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 10: // L2  VOICE TAGS
                        while(true){
                            System.out.println("%n      VOICE TAGS     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 0://   L2  BACK
                        break;                        

                    default:
                        System.out.printf("Invalid choice!%n");                                      
                       }        
                   if (subMenuChoice == 0) break;        
                }
                break;
                
            case 2: // L1 MESSAGES
                
                System.out.printf("MESSAGES %n");
                while(true){
                    System.out.printf("%n        MESSAGES      %n");
                    System.out.printf("1. Write Messages%n2. Inbox%n3. Outbox name%n4. Picture Message%n5. Templates%n6. Simileys%n7. Message Settings%n8. Info Service%n9. Voice Mail Number%n10. Service Command Editor%n0. Back%n");
                    int subMenuChoice = input.nextInt();
                    switch (subMenuChoice){
                    
                    case 1: // L2   WRITE MESSAGES
                        while(true){
                            System.out.println("%n      WRITE MESSAGES       %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        }
                        break;

                    case 2: // L2   INBOX
                        while(true){
                            System.out.println("%n      INBOX     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 3: //  L2  OUTBOX
                        while(true){
                            System.out.println("%n      OUTBOX     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 4: //  L2  PICTURE MESSAGE
                        while(true){
                            System.out.println("%n      PICTURE MESSAGE     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 5: //  L2  TEMPLATES
                        while(true){
                            System.out.println("%n      TEMPLATES     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 6: //  L2  SIMILEYS
                        while(true){
                            System.out.println("%n      SIMILEYS     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 8: //  L2  INFO SERVICE
                        while(true){
                            System.out.printf("%n      INFO SERVICE     %n");
                            System.out.printf("0. Back%n");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                   case 7: // L2    MESSAGE SETTINGS
                        while(true) {
                            System.out.printf("%n      MESSAGE SETTINGS     %n");
                            System.out.printf("1. Set 1%n2. Common%n0. Back%n");

                            int messageSettingsMenuChoice = input.nextInt();

                            switch (messageSettingsMenuChoice){

                                case 1: // L3   SET 1
                                    while(true) {
                                        System.out.printf("%n      SET 1     %n");
                                        System.out.printf("1. Message Center Number%n2. Messages Sent as%n3. Message Validity%n0. Back%n");

                                        int set1MenuChoice = input.nextInt();
                                        switch(set1MenuChoice){
                                            case 1: // L4 Message center Number
                                                while(true){
                                                    System.out.printf("%n       Message Center Number       %n");
                                                    System.out.printf("%n0. Back%n");

                                                    int messageCenterNumberMenuChoice = input.nextInt();
                                                    if (messageCenterNumberMenuChoice == 0) break; 
                                                    else System.out.printf("Invalid entry choice!%n");                 
                                                }
                                                break;
                                            case 2: // L4 Messages Sent as
                                                while(true){
                                                    System.out.printf("%n       Messages Sent as       %n");
                                                    System.out.printf("%n0. Back%n");

                                                    int messagesSentAsMenuChoice = input.nextInt();
                                                    if (messagesSentAsMenuChoice == 0) break; 
                                                    else System.out.printf("Invalid entry choice!%n");                 
                                                }
                                                break;
                                            case 3: // L4 Message Validity
                                                while(true){
                                                    System.out.printf("%n       Message Validity       %n");
                                                    System.out.printf("%n0. Back%n");

                                                    int messageValidityMenuChoice = input.nextInt();
                                                    if (messageValidityMenuChoice == 0) break; 
                                                    else System.out.printf("Invalid entry choice!%n");                 
                                                }
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.printf("Invalid entry choice!%n");       
                                        }
                                       if (set1MenuChoice == 0) break;
                                    }
                                    break;

                                case 2: // L3   COMMON
                                    while(true) {
                                        System.out.printf("%n      COMMON    %n");
                                        System.out.printf("1. Delivery Reports%n2. Reply Via Same Center%n3. Character Support%n0. Back%n");

                                        int commonMenuChoice = input.nextInt();
                                        switch(commonMenuChoice){
                                            case 1: // L4 Delivery Reports
                                                while(true){
                                                    System.out.printf("%n       Delivery Reports      %n");
                                                    System.out.printf("%n0. Back%n");

                                                    int deliveryReportsMenuChoice = input.nextInt();
                                                    if (deliveryReportsMenuChoice == 0) break; 
                                                    else System.out.printf("Invalid entry choice!%n");                 
                                                }
                                                break;
                                            case 2: // L4 Reply Via Same Center
                                                while(true){
                                                    System.out.printf("%n       Reply Via Same Center      %n");
                                                    System.out.printf("%n0. Back%n");

                                                    int replyViaSameCenter = input.nextInt();
                                                    if (replyViaSameCenter == 0) break; 
                                                    else System.out.printf("Invalid entry choice!%n");                 
                                                }
                                                break;
                                            case 3: // L4 Character Support
                                                while(true){
                                                    System.out.printf("%n       Character Support       %n");
                                                    System.out.printf("%n0. Back%n");

                                                    int characterSupportMenuChoice = input.nextInt();
                                                    if (characterSupportMenuChoice == 0) break; 
                                                    else System.out.printf("Invalid entry choice!%n");                 
                                                }
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.printf("Invalid entry choice!%n");       
                                        }
                                       if (commonMenuChoice == 0) break;
                                    }
                                    break;

                                case 0:
                                    break;

                                default:
                                    System.out.printf("Invalid choice!%n");
                            }

                            if (messageSettingsMenuChoice == 0) break;
                        }
                        break;
                                

                    case 9: //  L2  SPEED DIALS
                        while(true){
                            System.out.println("%n      SPEED DIALS     %n");
                            System.out.println("0. Back");

                            int speedDialsMenuChoice = input.nextInt();
                            switch (speedDialsMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (speedDialsMenuChoice == 0) break;
                        } 
                        break;  

                    case 10: // L2  VOICE TAGS
                        while(true){
                            System.out.println("%n      VOICE TAGS     %n");
                            System.out.println("0. Back");

                            int subSubMenuChoice = input.nextInt();
                            switch (subSubMenuChoice){
                                case 0:
                                    break;
                                default:
                                    System.out.printf("Invalid choice!%n"); 
                
                            }
                            if (subSubMenuChoice == 0) break;
                        } 
                        break;  

                    case 0://   L2  BACK
                        break;                        

                    default:
                        System.out.printf("Invalid choice!%n");                                      
                       }        
                   if (subMenuChoice == 0) break;        
                }
                break;
            



            case 3: // L1 CHAT
                System.out.printf("CHAT menu%n");
                break;   



            case 4: // L1 CALL REGISTER
                System.out.printf("Messages menu%n");
                break;



            case 5: // L1 TONES
                System.out.printf("CALL REGISTER%n");
                break;


            case 6: // L1 SETTINGS
                System.out.printf("SETTINGS%n");
                break;



            case 7: // L1 CALL DIVERT
                System.out.printf("CALL DIVERT%n");
                break;


            case 8: // L1 GAMES
                System.out.printf("GAMES%n");
                break;


            case 9: // L1 CALCULATORS
                System.out.printf("CALCULATORS%n");
                break;



            case 10: // L1 REMINDERS
                System.out.printf("REMINDERS%n");
                break;



            case 11: // L1 CLOCK   
                System.out.printf("CLOCK  %n");
                break;



            case 12: // L1 PROFILE
                System.out.printf("PROFILE%n");
                break;



            case 13: // L1 SIM SERVICES
                System.out.printf("SIM SERVICES%n");
                break;                      
    

            case 0:
                return;         


            }
        }
    }
}
