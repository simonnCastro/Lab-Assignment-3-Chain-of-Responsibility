public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNext(recyclableCollector);
        recyclableCollector.setNext(hazardousCollector);

        WasteContainer organicWaste = new WasteContainer("Organic", 10);
        WasteContainer recyclableWaste = new WasteContainer("Recyclable", 15);
        WasteContainer hazardousWaste = new WasteContainer("Hazardous", 5);

        organicWaste.addWaste(10);
        recyclableWaste.addWaste(15);
        hazardousWaste.addWaste(5);

        organicCollector.handleWaste(organicWaste);
        organicCollector.handleWaste(recyclableWaste);
        organicCollector.handleWaste(hazardousWaste);
    }
}