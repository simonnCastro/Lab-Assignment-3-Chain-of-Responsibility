class WasteContainer {
    private String wasteType;
    private int capacity;
    private int currentLoad;

    public WasteContainer(String wasteType, int capacity) {
        this.wasteType = wasteType;
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    public String getWasteType() {
        return wasteType;
    }

    public boolean isFull() {
        return currentLoad >= capacity;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void addWaste(int amount) {
        this.currentLoad += amount;
        if (this.currentLoad > capacity) {
            this.currentLoad = capacity;
        }
    }

    public void emptyContainer() {
        this.currentLoad = 0;
    }

    public int getCapacity() {
        return capacity;
    }
    
}