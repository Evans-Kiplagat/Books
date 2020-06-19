package com.example.book;

import java.util.ArrayList;

public class utils {

    private static utils instance;


    private static ArrayList<Bookmodel > allbooks;
    private static ArrayList<Bookmodel> favbook;
    private static ArrayList<Bookmodel> readings;
    private static ArrayList<Bookmodel> alreadyreads;
    private static ArrayList<Bookmodel> wishlist;



    private utils() {
        if(null== allbooks){
           allbooks = new ArrayList<>();
           initData(); }
        if(null== favbook){
            favbook = new ArrayList<>();
             }
        if(null== readings){
            readings = new ArrayList<>();
             }
        if(null== alreadyreads){
            alreadyreads = new ArrayList<>();
             }
        if(null== wishlist){
            wishlist = new ArrayList<>();
             }


    }

    private void initData() {


        allbooks.add(new Bookmodel("race",569,"https://prodimage.images-bn.com/pimages/9780525509288_p0_v3_s192x300.jpg","The provocateur-scholar returns to the pulpit to deliver a hard-hitting sermon on the racial divide, directed specifically to a white congregation.\n" +
                "\n" +
                "Though Dyson (Sociology/Georgetown Univ.; The Black Presidency: Barack Obama and the Politics of Race in America, 2016, etc.) may be best known for his writings on race and culture, he is also an ordained minister, and it is this role and voice he assumes in his latest manifesto. The book is structured as a religious service, and its cadences practically demand to be heard rather than read. Here is what he calls “a plea, a cry, a sermon, from my heart to yours,” because “what I need to say can only be said as a sermon,” one in which he preaches that “we must return to the moral and spiritual foundations of our country and grapple with the consequences of our original sin.” Not that the faith Dyson espouses is specifically or narrowly Christian or directed solely to those of that religion. In his recasting, the original sin might be seen as white privilege and black subjugation, addressed throughout as a white problem that white people must take significant steps to confront—first, by accepting that “white history disguised as American history is a fantasy, as much a fantasy as white superiority and white purity. Those are all myths. They’re intellectual rubbish, cultural garbage.” The author demands that readers overcome their defensiveness and claims to innocence and recognize how much they’ve benefitted from that myth and how much black Americans have suffered from it—and continue to do so. Dyson personalizes the debates surrounding Black Lives Matter and the institutional subjugation of black citizens by police. He also proposes a form of reparations that is individual rather than institutional, that conscientious white people might set up “an I.R.A., an Individual Reparations Account” and commit themselves to the service of black children, black prisoners, black protestors, and black communities.\n" +
                "\n" +
                "The readership Dyson addresses may not fully be convinced, but it can hardly remain unmoved by his fiery prose.\n" +
                " 6",1));
        allbooks.add(new Bookmodel("malcom x",457,"https://prodimage.images-bn.com/pimages/9780345350688_p0_v3_s118x184.jpg","Straight talk to blacks and whites about the realities of racism.\n" +
                "\n" +
                "In her feisty debut book, Oluo, essayist, blogger, and editor at large at the Establishment magazine, writes from the perspective of a black, queer, middle-class, college-educated woman living in a “white supremacist country.” The daughter of a white single mother, brought up in largely white Seattle, she sees race as “one of the most defining forces” in her life. Throughout the book, Oluo responds to questions that she has often been asked, and others that she wishes were asked, about racism “in our workplace, our government, our homes, and ourselves.” “Is it really about race?” she is asked by whites who insist that class is a greater source of oppression. “Is police brutality really about race?” “What is cultural appropriation?” and “What is the model minority myth?” Her sharp, no-nonsense answers include talking points for both blacks and whites. She explains, for example, “when somebody asks you to ‘check your privilege’ they are asking you to pause and consider how the advantages you’ve had in life are contributing to your opinions and actions, and how the lack of disadvantages in certain areas is keeping you from fully understanding the struggles others are facing.” She unpacks the complicated term “intersectionality”: the idea that social justice must consider “a myriad of identities—our gender, class, race, sexuality, and so much more—that inform our experiences in life.” She asks whites to realize that when people of color talk about systemic racism, “they are opening up all of that pain and fear and anger to you” and are asking that they be heard. After devoting most of the book to talking, Oluo finishes with a chapter on action and its urgency. Action includes pressing for reform in schools, unions, and local governments; boycotting businesses that exploit people of color; contributing money to social justice organizations; and, most of all, voting for candidates who make “diversity, inclusion and racial justice a priority.”\n" +
                "\n" +
                "A clear and candid contribution to an essential conversation.",2));
        allbooks.add(new Bookmodel("dead for life",457,"https://prodimage.images-bn.com/pimages/9781728209807_p0_v4_s192x300.jpg","Title notwithstanding, this latest from the National Book Award–winning author is no guidebook to getting woke.\n" +
                "\n" +
                "In fact, the word “woke” appears nowhere within its pages. Rather, it is a combination memoir and extension of Atlantic columnist Kendi’s towering Stamped From the Beginning (2016) that leads readers through a taxonomy of racist thought to anti-racist action. Never wavering from the thesis introduced in his previous book, that “racism is a powerful collection of racist policies that lead to racial inequity and are substantiated by racist ideas,” the author posits a seemingly simple binary: “Antiracism is a powerful collection of antiracist policies that lead to racial equity and are substantiated by antiracist ideas.” The author, founding director of American University’s Antiracist Research and Policy Center, chronicles how he grew from a childhood steeped in black liberation Christianity to his doctoral studies, identifying and dispelling the layers of racist thought under which he had operated. “Internalized racism,” he writes, “is the real Black on Black Crime.” Kendi methodically examines racism through numerous lenses: power, biology, ethnicity, body, culture, and so forth, all the way to the intersectional constructs of gender racism and queer racism (the only section of the book that feels rushed). Each chapter examines one facet of racism, the authorial camera alternately zooming in on an episode from Kendi’s life that exemplifies it—e.g., as a teen, he wore light-colored contact lenses, wanting “to be Black but…not…to look Black”—and then panning to the history that informs it (the antebellum hierarchy that valued light skin over dark). The author then reframes those received ideas with inexorable logic: “Either racist policy or Black inferiority explains why White people are wealthier, healthier, and more powerful than Black people today.” If Kendi is justifiably hard on America, he’s just as hard on himself. When he began college, “anti-Black racist ideas covered my freshman eyes like my orange contacts.” This unsparing honesty helps readers, both white and people of color, navigate this difficult intellectual territory.\n" +
                "\n" +
                "Not an easy read but an essential one.",3));
        allbooks.add(new Bookmodel("killed at sight",457,"https://prodimage.images-bn.com/pimages/9781338674453_p0_v2_s192x300.jpg","thij is the best book",4));
        allbooks.add(new Bookmodel("can't breath",457,"https://prodimage.images-bn.com/pimages/9780807047415_p0_v5_s118x184.jpg","thij is the best book",5));
        allbooks.add(new Bookmodel("father and mom",457,"https://prodimage.images-bn.com/pimages/9781580058827_p0_v4_s118x184.jpg","thij is the best book",6));
        allbooks.add(new Bookmodel("father and mom",457,"https://prodimage.images-bn.com/pimages/9780316707046_p0_v3_s192x300.jpg","thij is the best book",7));
        allbooks.add(new Bookmodel("father and mom",457,"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ5foWKFUpINY61n7iQu4qeAzvOS4O7gGmDYu1j0tvBfmsP7r_Z&usqp=CAU","In this pathbreaking study of the contemporary “male crisis,” award-winning journalist and author Faludi solidifies her reputation first gained in Backlash (1991) as one of our most astute analysts of gender relations.\n" +
                "\n" +
                "Something is wrong with men. They are unhappy, angry, bewildered, and all too often violent. Conventional wisdom—which Faludi always delights in skewering—suggests that either men must change their individual natures to overcome this crisis or that men are victims of the undeserving: “scheming feminists, affirmative-action proponents, job-grabbing illegal aliens.” Faludi comes to a different conclusion. In the course of spending time with men—laid-off industrial workers, bewildered Vietnam vets, young male sexual predators, evangelical truth seekers, and many others—chronicling their thoughts, aspirations, explanations, and exasperations, she finds that men are not to blame for their current predicament, nor on the whole is some sinister other. Rather, American men of the post-WWII world have been betrayed by culture and society. Taught by fathers to assume inheritance of a world they would firmly control, it turns out they don't control it at all. Meaningful work that both established and existed within a broader social purpose is gone for all but a few. The virtues of trust and loyalty are now laughable anachronisms. All that is left of masculinity is an ornamental facade of what Faludi terms individual male “superdominance.” This pose of control without a reality behind it is surely a recipe for crisis. Yet it is this very pose of control that prevents men from seeing their dilemma as a human crisis of powerlessness in modern society (one women recognized long ago) and collectively acting to change their situation. Instead, they howl at the moon to recapture their masculinity or lash out at supposed enemies. In the end, the more they struggle the more tightly they are bound.\n" +
                "\n" +
                "This is brilliant stuff, cutting through nonsense, letting men speak for themselves and taking from their words original and compas",8));



    }

    public static utils getInstance() {
        if (null != instance) {
            return instance;
        }
        else {
            instance =new utils();
            return instance;
        }


    }

    public static ArrayList<Bookmodel> getAllbooks() {
        return allbooks;
    }

    public static ArrayList<Bookmodel> getFavbook() {
        return favbook;
    }

    public static ArrayList<Bookmodel> getReadings() {
        return readings;
    }

    public static ArrayList<Bookmodel> getAlreadyreads() {
        return alreadyreads;
    }

    public static ArrayList<Bookmodel> getWishlist() {
        return wishlist;
    }

    public  Bookmodel getBoolById(int bookid){
        for(Bookmodel b:allbooks){

            if (b.getBookid() == bookid)  {
                return b;
            }
        }

      return null;
    }

    public  Boolean AddallreadyreadBook(Bookmodel book){

        return alreadyreads.add(book);
    }
    public  Boolean addFavbook(Bookmodel book){

        return favbook.add(book);
    }
    public  Boolean addreads(Bookmodel book){

        return readings.add(book);
    }
    public  Boolean addwishbook(Bookmodel book){

        return wishlist.add(book);
    }
}