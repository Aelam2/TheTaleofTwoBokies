package agentsparkles.thetaleoftwobokies.model;

import agentsparkles.thetaleoftwobokies.R;

public class Story {
    private Page[] pages;

    public Story(){
        pages = new Page[12];

        pages[0] = new Page(R.drawable.page0,
                R.string.page0,
                new Choice(R.string.page0_choice1, 1),
                new Choice(R.string.page0_choice2, 6));

        pages[1] = new Page(R.drawable.page1,
                R.string.page1,
                new Choice(R.string.page1_choice1, 11),
                new Choice(R.string.page1_choice2, 2));

        pages[2] = new Page(R.drawable.page2,
                R.string.page2,
                new Choice(R.string.page2_choice1, 9),
                new Choice(R.string.page2_choice2, 10));

        pages[3] = new Page(R.drawable.page3,
                R.string.page3,
                new Choice(R.string.page3_choice1, 4),
                new Choice(R.string.page3_choice2, 8));

        pages[4] = new Page(R.drawable.page4,
                R.string.page4,
                new Choice(R.string.page4_choice1, 5),
                new Choice(R.string.page4_choice1, 5));

        pages[5] = new Page(R.drawable.page5, R.string.page5);

        pages[6] = new Page(R.drawable.page6,
                    R.string.page6);

        pages[7] = new Page(R.drawable.page3, R.string.page7);

        pages[8] = new Page(R.drawable.page3, R.string.page8);

        pages[9] = new Page(R.drawable.page9,
                R.string.page9,
                new Choice(R.string.page10_choice1, 3),
                new Choice(R.string.page10_choice1, 3));
        pages[10] = new Page(R.drawable.page10,
                R.string.page10,
                new Choice(R.string.page10_choice1, 3),
                new Choice(R.string.page10_choice1, 3));
        pages[11] = new Page(R.drawable.page11,
                R.string.page11,
                new Choice(R.string.page11_choice1, 9),
                new Choice(R.string.page11_choice2, 10));
    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length){
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}
