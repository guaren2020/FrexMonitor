package com.ocean.proxy.serverdis;

import org.apache.commons.lang3.StringUtils;

import com.ocean.core.common.JsonUtils;
import com.ocean.core.common.threadpool.workthread.AsynAbstractTask;
import com.ocean.persist.api.proxy.miquwan.MiquwanAdPullResponse;
import com.ocean.persist.api.proxy.miquwan.MiquwanAdpullParams;
import com.ocean.persist.api.proxy.woso.WosoAdPullParams;
import com.ocean.persist.api.proxy.woso.WosoAdResponse;

/** * @author Alex & E-mail:569246607@qq.com
      @date   2017年10月27日 
      @version 1.0 
 */
public class AdProxyWosoTask extends AsynAbstractTask<WosoAdPullParams,WosoAdResponse>{

	@Override
	public String reqFormat() {
		// TODO Auto-generated method stub
		return  JsonUtils.toJson(param);
	}

	@Override
	public byte[] reqByteFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WosoAdResponse respFormat(String result) throws Exception {
		// TODO Auto-generated method stub
		WosoAdResponse resp=null;
		try{
			
			if(StringUtils.isNotEmpty(result)){
				resp=JsonUtils.toBean(result, WosoAdResponse.class);
			}
		}catch (Throwable e) {
			LOGGER.error("woso parse response data error(Exception),msg:{}",e.getMessage(),e);
		}finally{
			this.setResponse(resp);
		}
		return  this.getResponse();
	}

	@Override
	public WosoAdResponse respFormat(byte[] result) {
		// TODO Auto-generated method stub
		return null;
	}

}
