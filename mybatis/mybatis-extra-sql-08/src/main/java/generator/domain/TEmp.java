package generator.domain;

import java.io.Serializable;

/**
 * 
 * @TableName t_emp
 */
public class TEmp implements Serializable {
    /**
     * 
     */
    private Integer empId;

    /**
     * 
     */
    private String empName;

    /**
     * 
     */
    private Double empSalary;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * 
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * 
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 
     */
    public Double getEmpSalary() {
        return empSalary;
    }

    /**
     * 
     */
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TEmp other = (TEmp) that;
        return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getEmpSalary() == null ? other.getEmpSalary() == null : this.getEmpSalary().equals(other.getEmpSalary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getEmpSalary() == null) ? 0 : getEmpSalary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", empSalary=").append(empSalary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}