class HazardousWasteCollector extends WasteCollector {
    public void handleWaste(WasteContainer container) {
        if ("Hazardous".equals(container.getWasteType()) && container.isFull()) {
            System.out.println("Collecting and disposing of Organic waste (Capacity: " + container.getCapacity() + ").");
            container.emptyContainer();
        } else {
            super.handleWaste(container);
        }
    }
}