abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNext(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void handleWaste(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.handleWaste(container);
        } else {
            System.out.println("No collector available for this waste type.");
        }
    }
}