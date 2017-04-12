package com.dante.model.apiInfo;

import com.dante.model.base.BaseRecord;

public class ApiColumn extends BaseRecord{
    /**
	 * 序列号
	 */
	private static final long serialVersionUID = 7952428273609236657L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DANTE_API_COLUMN.API_COLUMN_ID
     *
     * @mbg.generated
     */
    private String apiColumnId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DANTE_API_COLUMN.API_COLUMN_TYPE
     *
     * @mbg.generated
     */
    private String apiColumnType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DANTE_API_COLUMN.API_INFO_ID
     *
     * @mbg.generated
     */
    private String apiInfoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DANTE_API_COLUMN.COLUMN_INFO_ID
     *
     * @mbg.generated
     */
    private String columnInfoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DANTE_API_COLUMN.COLUMN_INFO_NAME
     *
     * @mbg.generated
     */
    private String columnInfoName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DANTE_API_COLUMN.API_COLUMN_ID
     *
     * @return the value of DANTE_API_COLUMN.API_COLUMN_ID
     *
     * @mbg.generated
     */
    public String getApiColumnId() {
        return apiColumnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DANTE_API_COLUMN.API_COLUMN_ID
     *
     * @param apiColumnId the value for DANTE_API_COLUMN.API_COLUMN_ID
     *
     * @mbg.generated
     */
    public void setApiColumnId(String apiColumnId) {
        this.apiColumnId = apiColumnId == null ? null : apiColumnId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DANTE_API_COLUMN.API_COLUMN_TYPE
     *
     * @return the value of DANTE_API_COLUMN.API_COLUMN_TYPE
     *
     * @mbg.generated
     */
    public String getApiColumnType() {
        return apiColumnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DANTE_API_COLUMN.API_COLUMN_TYPE
     *
     * @param apiColumnType the value for DANTE_API_COLUMN.API_COLUMN_TYPE
     *
     * @mbg.generated
     */
    public void setApiColumnType(String apiColumnType) {
        this.apiColumnType = apiColumnType == null ? null : apiColumnType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DANTE_API_COLUMN.API_INFO_ID
     *
     * @return the value of DANTE_API_COLUMN.API_INFO_ID
     *
     * @mbg.generated
     */
    public String getApiInfoId() {
        return apiInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DANTE_API_COLUMN.API_INFO_ID
     *
     * @param apiInfoId the value for DANTE_API_COLUMN.API_INFO_ID
     *
     * @mbg.generated
     */
    public void setApiInfoId(String apiInfoId) {
        this.apiInfoId = apiInfoId == null ? null : apiInfoId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DANTE_API_COLUMN.COLUMN_INFO_ID
     *
     * @return the value of DANTE_API_COLUMN.COLUMN_INFO_ID
     *
     * @mbg.generated
     */
    public String getColumnInfoId() {
        return columnInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DANTE_API_COLUMN.COLUMN_INFO_ID
     *
     * @param columnInfoId the value for DANTE_API_COLUMN.COLUMN_INFO_ID
     *
     * @mbg.generated
     */
    public void setColumnInfoId(String columnInfoId) {
        this.columnInfoId = columnInfoId == null ? null : columnInfoId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DANTE_API_COLUMN.COLUMN_INFO_NAME
     *
     * @return the value of DANTE_API_COLUMN.COLUMN_INFO_NAME
     *
     * @mbg.generated
     */
    public String getColumnInfoName() {
        return columnInfoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DANTE_API_COLUMN.COLUMN_INFO_NAME
     *
     * @param columnInfoName the value for DANTE_API_COLUMN.COLUMN_INFO_NAME
     *
     * @mbg.generated
     */
    public void setColumnInfoName(String columnInfoName) {
        this.columnInfoName = columnInfoName == null ? null : columnInfoName.trim();
    }

}