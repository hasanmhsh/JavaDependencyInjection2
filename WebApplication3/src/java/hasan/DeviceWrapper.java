package hasan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@Model
@ApplicationScoped
public class DeviceWrapper {

	@Inject
	private @CDPlayerQualifier VolumeAdjustable va;
	@Inject 
	private @TelevisionQualifier VolumeAdjustable tv;
	@Inject 
	private @RadioQualifier VolumeAdjustable rd;
	@Inject 
	private @XBOXQualifier VolumeAdjustable xb;
	@Inject 
	private @PlayStationQualifier  VolumeAdjustable ps;

    public VolumeAdjustable getVa() {
        return va;
    }

    public void setVa(VolumeAdjustable va) {
        this.va = va;
    }

    public VolumeAdjustable getTv() {
        return tv;
    }

    public void setTv(VolumeAdjustable tv) {
        this.tv = tv;
    }

    public VolumeAdjustable getRd() {
        return rd;
    }

    public void setRd(VolumeAdjustable rd) {
        this.rd = rd;
    }

    public VolumeAdjustable getXb() {
        return xb;
    }

    public void setXb(VolumeAdjustable xb) {
        this.xb = xb;
    }

    public VolumeAdjustable getPs() {
        return ps;
    }

    public void setPs(VolumeAdjustable ps) {
        this.ps = ps;
    }
	
}
