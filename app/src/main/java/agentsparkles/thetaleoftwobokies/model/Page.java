package agentsparkles.thetaleoftwobokies.model;

public class Page {
    private boolean isOnePage = false;
    private int ImageId;
    private int textId;
    private Choice Choice1;
    private Choice Choice2;
    private boolean isFinalPage = false;

    public Page(int imageId, int textId, Choice choice1, Choice choice2) {
        ImageId = imageId;
        this.textId = textId;
        Choice1 = choice1;
        Choice2 = choice2;
    }

    public Page(int imageId, int textId, Choice choice1) {
        ImageId = imageId;
        this.textId = textId;
        Choice1 = choice1;
        isOnePage = true;
    }

    public Page(int imageId, int textId) {
        ImageId = imageId;
        this.textId = textId;
        this.isFinalPage = true;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }
    public Choice getChoice1() {
        return Choice1;
    }

    public void setChoice1(Choice choice1) {
        Choice1 = choice1;
    }

    public Choice getChoice2() {
        return Choice2;
    }

    public void setChoice2(Choice choice2) {
        Choice2 = choice2;
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        isFinalPage = finalPage;
    }

    public boolean isOnePage() {
        return isOnePage;
    }

    public void setOnePage(boolean isOnePage) {
        isFinalPage = isOnePage;
    }
}
