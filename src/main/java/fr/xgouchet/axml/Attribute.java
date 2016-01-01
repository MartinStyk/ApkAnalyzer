package fr.xgouchet.axml;

public class Attribute {

    private String mName, mPrefix, mNamespace, mValue;

    /**
     * @return the name
     */
    public String getName() {
        return mName;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        mName = name;
    }

    /**
     * @return the prefix
     */
    public String getPrefix() {
        return mPrefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(final String prefix) {
        mPrefix = prefix;
    }

    /**
     * @return the namespace
     */
    public String getNamespace() {
        return mNamespace;
    }

    /**
     * @param namespace the namespace to set
     */
    public void setNamespace(final String namespace) {
        mNamespace = namespace;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return mValue;
    }

    /**
     * @param value the value to set
     */
    public void setValue(final String value) {
        mValue = value;
    }
}