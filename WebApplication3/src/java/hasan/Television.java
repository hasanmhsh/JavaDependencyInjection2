package hasan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@TelevisionQualifier
@ApplicationScoped
@Model
public class Television implements VolumeAdjustable {

	private String deviceVolume;
	@Inject private National coo;
	
	
	@Override
	public String getDeviceVolume() {
		// TODO Auto-generated method stub
		deviceVolume="tvvol:77";
		return deviceVolume+coo.getCOO();
	}

	@Override
	public void setDeviceVolume(String deviceVolume) {
		// TODO Auto-generated method stub
		this.deviceVolume = deviceVolume;
	}

}
