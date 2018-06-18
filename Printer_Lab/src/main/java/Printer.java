public class Printer {

    private int numSheetsPaperLeft;
    private int tonerVolume;

    public Printer(int numSheetsPaperLeft, int tonerVolume) {
        this.numSheetsPaperLeft = numSheetsPaperLeft;
        this.tonerVolume = tonerVolume;
    }

    public void print(int numPages, int numCopies) {
        int pagesToPrint = numPages * numCopies;
        if (this.numSheetsPaperLeft >= pagesToPrint){
            this.numSheetsPaperLeft = this.numSheetsPaperLeft - pagesToPrint;
            this.tonerVolume = tonerVolume - pagesToPrint;
        }
    }

    public int getNumSheetsPaperLeft() {
        return numSheetsPaperLeft;
    }

    public void refill(int newSheets) {
        this.numSheetsPaperLeft = this.numSheetsPaperLeft + newSheets;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
