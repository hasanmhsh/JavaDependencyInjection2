package hasan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@SubwooferQualifier
@ApplicationScoped
@Model
public class Subwoofer implements VolumeAdjustable {


	private String deviceVolume;
	@Inject private National coo;
	
	
	@Override
	public String getDeviceVolume() {
		// TODO Auto-generated method stub
		deviceVolume="subwvol:77";
		return deviceVolume+coo.getCOO();
	}

	@Override
	public void setDeviceVolume(String deviceVolume) {
		// TODO Auto-generated method stub
		this.deviceVolume = deviceVolume;
	}

}
