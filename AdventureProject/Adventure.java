// attempted callback, locked door, compound gate, and de morgan
import java.util.Scanner;

public class Adventure {
    private static boolean hasStudied = false;
    private static boolean wastedTime = false;
    private static boolean arjunAnnoyed = false;
    private static boolean isAwake = false;
    private static int choice = 1;
    private static final Scanner input = new Scanner(System.in);

    private static int readChoice() {
        int n = input.nextInt();
        input.nextLine();
        return n;
    }

    public static void playScene(int sceneNum) {
        if (sceneNum == 1) {
            // BEGINNING SCENE
            System.out.println("Your name is Aiden.\nIt is the end of lunch. You remember that you have a Biology test in 5 minutes, and you have not studied. What do you do?\n1. Study for 5 minutes.\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                playScene(2);
            } else {
                playScene(40);
            }
        } else if (sceneNum == 2) {
            // DIDNT WAKE UP AND STUDIED
            System.out.println("You start studying. Arjun, being a troll, gives you a wedgie and squirts milk on you. You spend all your time cleaning yourself up. Now you have no time to study for your test.\n1. Go take your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                playScene(3);
            } else {
                playScene(40);
            }
        } else if (sceneNum == 3) {
            // STARTING TEST
            System.out.println("The test is in front of you. it has 36 multiple choice questions.\nYou don't know how to do the first question.\n1. Guess\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                playScene(4);
            } else {
                playScene(40);
            }
        } else if (sceneNum > 3 && sceneNum < 39) {
            System.out.println("You guessed on number " + (sceneNum - 3) + ". You don't know how to do question " + (sceneNum - 2) + " either.\n1. Guess\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                playScene(sceneNum + 1);
            } else {
                playScene(40);
            }
        } else if (sceneNum == 39) {
            System.out.println("You guessed on number 36. That was the last question, and you have no idea whether you got a single one of them right.\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            playScene(40);
        } else if (sceneNum == 40) {
            // WAKE
            System.out.println("You wake up. You realize that you do, indeed, have a Biology test. Thankfully, you now have a whole day to study. What do you do?\n1. Get up from bed and do your standard morning routine\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1 && !isAwake) {
                isAwake = true;
                playScene(42);
            } else {
                if (choice == 1 && isAwake) {
                    System.out.println("And... you're back.");
                    playScene(42);
                } else {
                    wastedTime = true;
                    playScene(41);
                }
            }
        } else if (sceneNum == 41) {
            System.out.println("You take off your clothes and run around naked. But you're in your bedroom, and you just wasted 15 minutes. You get tired of running and start your morning routine.");
            playScene(42);
        } else if (sceneNum == 42) {
            // MORNING
            System.out.println("You finish your morning routine and decide to eat a bowl of cereal for breakfast.\n1. Read your biology notes while eating\nOther. Scroll reels while eating");
            choice = readChoice();
            if (choice == 1) hasStudied = true;
            
            System.out.println("You finish eating breakfast, and go outside to wait for the bus.\n1. Read your biology notes while waiting\nOther. Scroll reels while waiting");
            choice = readChoice();
            if (choice == 1) hasStudied = true;

            System.out.println("You are on the bus.\n1. Read your biology notes on the bus\nOther. Scroll reels while on the bus");
            choice = readChoice();
            if (choice == 1) hasStudied = true;

            if (hasStudied) {
                System.out.println("You've studied a little this morning.");
            } else {
                System.out.println("You have not studied at all this morning, and are now feeling extremely stressed for this test.");
            }

            playScene(43);
        } else if (sceneNum == 43) {
            System.out.println("You have arrived at school. You go through APUSH without much commotion, but in CSA, you realize that you could be studying for Bio.\n1. Study for biology\n2. Annoy Arjun\nOther. Scroll reels");
            choice = readChoice();
            if (choice == 1) {
                hasStudied = true;
                playScene(44);
            } else if (choice == 2) {
                arjunAnnoyed = true;
                playScene(45);
            } else {
                playScene(60);
            }
        } else if (sceneNum == 44) {
            // STUDYING IN CSA
            System.out.println("You study quietly in the corner. CSA passes without commotion. You realize that you have Mr. Conrad for flex time.\n1. Go to Conrad\nOther. Skip Conrad and stay at Dennis");
            choice = readChoice();
            if (choice == 1) {
                playScene(46);
            } else {
                playScene(47);
            }
        } else if (sceneNum == 45) {
            // ANNOYING ARJUN
            System.out.println("The following dialogue takes place:\n\nAiden: morning sunshine\n\nArjun: Hey Aiden. You actually do the array assignment?\n\nAiden: nope. was gonna copy yours. you don't mind right\n\nArjun: ...I kind of do, but okay, I'll walk you through it. It's not that bad once you get the loops down.\n\nAiden: i love when you explain things. so patient. it's attractive honestly\n\nArjun: Please don't. Okay so you initialize the counter at zero--\n\nAiden: zero. mysterious. go on\n\nArjun: --and then you iterate while i is less than the length.\n\nAiden: and THEN what genius. what does the highest gpa to grace these halls do next\n\nArjun: [ignores that] Then you access the element at index i.\n\nAiden: so smart. so wasted on this class. you should be teaching. or modeling\n\nArjun: Can you take literally one thing seriously.\n\nAiden: i take you seriously\n\nArjun: The ASSIGNMENT, Aiden.\n\nAiden: oh the assignment. yeah no i already turned in random characters. figured it'd compile eventually. optimism\n\nArjun: That's not-- that's not how compiling WORKS.\n\nAiden: agree to disagree\n\nArjun: It's not a matter of OPINION. It either compiles or it doesn't. There is a right answer.\n\nAiden: you're cute when you get all rigid about it\n\nArjun: STOP saying that.\n\nAiden: saying what. that there's no right answer? or that you're cute\n\nArjun: I have spent TEN MINUTES trying to help you and you've contributed NOTHING except--\n\nAiden: highest gpa to grace these halls everybody\n\nArjun: I asked you to stop.\n\nAiden: you asked me to stop the OTHER thing. different thing. keep up\n\nArjun: Do you actually want to pass this class or is this a bit. Because I genuinely cannot tell anymore.\n\nAiden: why not both\n\nArjun: Because BOTH doesn't-- you can't just VIBE your way through a for-loop, Aiden, it doesn't run on VIBES--\n\nAiden: mine does\n\nArjun: YOURS DOESN'T RUN AT ALL. That's the WHOLE PROBLEM.\n\nAiden: ok you're kind of hot when you yell\n\nArjun: I am NOT-- I am not doing this with you. I am DONE. Copy someone else's. Copy the wall. I don't CARE anymore. You have wasted my ENTIRE period and I'm sitting here like an IDIOT explaining ITERATION to a brick that keeps calling me CUTE and I'm SO-- I'm SO done, Aiden.\n\nAiden: so is that a yes on modeling\n\nArjun: [stands up] Mr. Dennis? Yeah, hi. Can I move seats.\n\nAiden: whoa\n\nArjun: No, permanently. Anywhere. The floor is fine.\n\nAiden: babe\n\nArjun: [gathering his stuff] Don't. Do not \"babe\" me. I have asked you to stop approximately FORTY times and you have the retention span of a goldfish with a concussion, so I'm removing the variable. That's YOU. You're the variable.\n\nAiden: you're using CS terms for me. that's basically a love letter\n\nArjun: [already walking to the empty desk in the front row] Good luck with the array.\n\nAiden: ...\n\nAiden: ARJUN. arjun come back i'll do the loops. ARJUN.");
            System.out.println("Oops. Arjun's mad now. Oh well. You realize that you have Mr. Conrad for flex time.\n1. Go to Conrad\nOther. Skip Conrad and stay at Dennis");
            choice = readChoice();
            if (choice == 1) {
                playScene(46);
            } else {
                playScene(47);
            }
        } else if (sceneNum == 60) {
            // SCROLLING REELS IN CSA
            System.out.println("You scroll reels in the corner. CSA passes without commotion, and without you learning anything. You realize that you have Mr. Conrad for flex time.\n1. Go to Conrad\nOther. Skip Conrad and stay at Dennis");
            choice = readChoice();
            if (choice == 1) {
                playScene(46);
            } else {
                playScene(47);
            }
        } else if (sceneNum == 46) {
            // CONRAD FLEX
            System.out.println("Mr. Conrad glares at you. For the entire flex time. You do not get anything done. It is lunchtime.\n1. Go to lunch\nOther. Skip lunch");
            choice = readChoice();
            if (choice == 1) {
                playScene(48);
            } else {
                playScene(49);
            }
        } else if (sceneNum == 47) {
            // SKIP CONRAD
            System.out.println("Mr. Dennis glares at you. He is angry that you did not do your CSA work. You have to make it all up during flex. You do not get to study for Biology.\n1. Go to lunch\nOther. Skip lunch");
            choice = readChoice();
            if (choice == 1) {
                playScene(48);
            } else {
                playScene(50);
            }
        } else if (sceneNum == 48) {
            // LUNCH
            if (arjunAnnoyed) {
                System.out.println("Arjun glares at you. He is still annoyed as dingle. You try to study for biology, but he throws food at you the entire time. You can't focus at all.");
            } else {
                System.out.println("You study and eat quietly. Yuhang, being a supportive friend, encourages you and helps you review.");
            }
            System.out.println("Go to third period?");
            input.nextLine();
            playScene(51);
        } else if (sceneNum == 49) {
            // CONRAD NO LUNCH
            if (arjunAnnoyed) {
                System.out.println("You hear screaming downstairs. You recognize its Arjun's voice.");
            } else {
                System.out.println("You study productively for 30 minutes. Mr. Conrad is impressed by your determination.");
            }
            System.out.println("Go to third period?");
            input.nextLine();
            playScene(51);
        } else if (sceneNum == 50) {
            // DENNIS NO LUNCH
            if (arjunAnnoyed) {
                System.out.println("You hear screaming downstairs. You recognize its Arjun's voice.");
            } else {
                System.out.println("You study productively for 30 minutes. Mr. Dennis tries to help you, but doesn't know biology.");
            }
            System.out.println("Go to third period?");
            input.nextLine();
            playScene(51);
        } else if (sceneNum == 51) {
            // THIRD PERIOD OOOH
            System.out.println("AP Biology. Mr. Conrad gives the class a mean smile.\n\"There may be some *fun* questions on this test.\"\n\"Also, I am calling in one of my best students, the highest GPA to grace these halls, to grade your FRQs.\"\nStart the test?\n1. Yes\nOther. Yes");
            readChoice();
            // ALL OF THESE ENDINGS ARE LOCKED DOORS
            if (hasStudied && wastedTime && arjunAnnoyed) playScene(52);
            else if (hasStudied && wastedTime && !arjunAnnoyed) playScene(53);
            else if (hasStudied && !wastedTime && arjunAnnoyed) playScene(54);
            else if (hasStudied && !wastedTime && !arjunAnnoyed) playScene(55);
            // DEMORGAN
            // else if (hasStudied && !(wastedTime || arjunAnnoyed)) playScene(55);
            else if (!hasStudied && wastedTime && arjunAnnoyed) playScene(56);
            else if (!hasStudied && wastedTime && !arjunAnnoyed) playScene(57);
            else if (!hasStudied && !wastedTime && arjunAnnoyed) playScene(58);
            else if (!hasStudied && !wastedTime && !arjunAnnoyed) playScene(59);
        } else if (sceneNum == 52) {
            // STUDIED WASTED TIME ARJUN ANNOYED
            // CALLBACK
            System.out.println("You look at the questions, realizing that you actually know how to do them.\nBut, you realized that you forgot to review lipids due to you wasting time running around naked this morning. Lipids are a fifth of the test and you don't know anything about it.\nWhen you hit the FRQs, a sudden realization hits you. Maybe you shouldn't have annoyed Arjun all those hours ago. He will most definitely unfairly grade your FRQ. Oh no.\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got an 80 on the multiple choice section and a 0 on the FRQ section. You got a 40 on the test. You failed miserably.\nCongratulations! You obtained the 'annoyed, wasted, and failed' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 53) {
            // STUDIED WASTED TIME ARJUN GOOD
            System.out.println("You look at the questions, realizing that you actually know how to do them.\nBut, you realized that you forgot to review lipids due to you wasting time running around naked this morning. Lipids are a fifth of the test and you don't know anything about it.\nWhen you hit the FRQs, a sudden realization hits you. You feel glad that you didn't annoy Arjun all those hours ago. He will most definitely give you a free 100 on that section. Yay!\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got an 80 on the multiple choice section and a 100 on the FRQ section. You got a 90 on the test. You passed without flying colors.\nCongratulations! You obtained the 'passed but not good' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 54) {
            // STUDIED DIDNT WASTE TIME ARJUN ANNOYED
            System.out.println("You look at the questions, realizing that you actually know how to do them.\nYou also realized that you reviewed lipids in the time you could have been spending running around naked this morning.\nWhen you hit the FRQs, a sudden realization hits you. Maybe you shouldn't have annoyed Arjun all those hours ago. He will most definitely unfairly grade your FRQ. Oh no.\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got a 100 on the multiple choice section and a 0 on the FRQ section. You got a 50 on the test. You failed not-so-miserably!\nCongratulations! You obtained the 'half-and-half' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 55) {
            // STUDIED DIDNT WASTE TIME ARJUN GOOD
            System.out.println("You look at the questions, realizing that you actually know how to do them.\nYou also realized that you reviewed lipids in the time you could have been spending running around naked this morning.\nWhen you hit the FRQs, a sudden realization hits you. You feel glad that you didn't annoy Arjun all those hours ago. He will most definitely give you a free 100 on that section. Yay!\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got a 100 on the multiple choice section and a 100 on the FRQ section. You got a 100 on the test. You passed with flying colors!\nCongratulations! You obtained the 'perfect score' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 56) {
            // DIDNT STUDY WASTE TIME ARJUN ANNOYED
            System.out.println("You look at the questions. You have no clue how to do them.\nYou feel that as you would have failed anyway, you are glad to have explored your nature this morning.\nWhen you hit the FRQs, a sudden realization hits you. Maybe you shouldn't have annoyed Arjun all those hours ago. He will most definitely unfairly grade your FRQ. Oh no.\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got a 0 on the multiple choice section and a 0 on the FRQ section. You got a 0 on the test. You are sad about your score, but am still partially glad about this morning.\nCongratulations! You obtained the 'perfect 0' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 57) {
            // DIDNT STUDY WASTE TIME ARJUN GOOD
            System.out.println("You look at the questions. You have no clue how to do them.\nYou feel that as you would have failed anyway, you are glad to have explored your nature this morning.\nWhen you hit the FRQs, a sudden realization hits you. You feel glad that you didn't annoy Arjun all those hours ago. He will most definitely give you a free 100 on that section. Yay!\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got a 0 on the multiple choice section and a 100 on the FRQ section. You got a 50 on the test. Mr. Conrad is extremely suspicious, and starts investigating both you and Arjun. Both of you were caught for cheating and expelled. Yuhang is sad.\nCongratulations! You obtained the 'expelled' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 58) {
            // DIDNT STUDY DIDNT WASTE TIME ARJUN ANNOYED
            System.out.println("You look at the questions. You have no clue how to do them.\nYou feel that as you would have failed anyway, you are sad you didn't run around naked this morning. You realize that you have a chance to correct that now.\nWhen you hit the FRQs, a sudden realization hits you. Maybe you shouldn't have annoyed Arjun all those hours ago. He will most definitely unfairly grade your FRQ. Oh no.\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got a 0 on the multiple choice section and a 0 on the FRQ section. You got a 0 on the test. You are sad about your score.\nCongratulations! You obtained the 'perfect 0 but not naked' ending!");
            } else {
                playScene(40);
            }
        } else if (sceneNum == 59) {
            // DIDNT STUDY DIDNT WASTE TIME ARJUN GOOD
            System.out.println("You look at the questions. You have no clue how to do them.\nYou feel that as you would have failed anyway, you are sad you didn't run around naked this morning. You realize that you have a chance to correct that now.\nWhen you hit the FRQs, a sudden realization hits you. You feel glad that you didn't annoy Arjun all those hours ago. He will most definitely give you a free 100 on that section. Yay!\n1. Turn in your test\nOther. Take off your clothes and run around naked.");
            choice = readChoice();
            if (choice == 1) {
                System.out.println("You got a 0 on the multiple choice section and a 100 on the FRQ section. You got a 50 on the test. Mr. Conrad is extremely suspicious, and starts investigating both you and Arjun. Both of you were caught for cheating and expelled. Yuhang is sad.\nCongratulations! You obtained the 'expelled but not naked' ending!");
            } else {
                playScene(40);
            }
        } else {
            System.out.println("Congratulations! You have escaped the simulation! This is the final secret ending, obtained by finding a bug in my code or logic chain.");
        }
    }

    public static void main(String[] args) {
        playScene(1);
        input.close();
    }
}