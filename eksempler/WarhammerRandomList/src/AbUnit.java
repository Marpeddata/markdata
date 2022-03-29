public abstract class AbUnit implements Unit {

    String unitName;
    String type;
    int minimumUnitSize;
    int maximumUnitSize;
    int modelCost;

    AbUnit(String unitName, String type, int minimumUnitSize, int maximumUnitSize, int modelCost){
        this.unitName = unitName;
        this.type = type;
        this.minimumUnitSize = minimumUnitSize;
        this.maximumUnitSize = maximumUnitSize;
        this.modelCost = modelCost;
    }




    @Override
    public String getUnitName() {
        return unitName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinimumUnitSize() {
        return minimumUnitSize;
    }

    @Override
    public int getMaximumUnitSize() {
        return maximumUnitSize;
    }

    @Override
    public int getModelPrice() {
        return modelCost;
    }

    @Override
    public int getTotalUnitCost() {
        return 0;
    }
}
