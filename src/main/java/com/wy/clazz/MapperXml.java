package com.wy.clazz;


/**
 * @author wy
 */
public class MapperXml extends BaseClazz {

    private Mapper mapper;

    private Clazz clazz;

    private Boolean isGeneratedKey;

    private String keyProperty;

    private String keyColumn;


    public Mapper getMapper() {
        return mapper;
    }

    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Boolean getGeneratedKey() {
        return isGeneratedKey;
    }

    public void setGeneratedKey(Boolean generatedKey) {
        isGeneratedKey = generatedKey;
    }

    public String getKeyProperty() {
        return keyProperty;
    }

    public void setKeyProperty(String keyProperty) {
        this.keyProperty = keyProperty;
    }

    public String getKeyColumn() {
        return keyColumn;
    }

    public void setKeyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
    }
}
