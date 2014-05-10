package com.growcontrol.gccommon.meta.metaTypes;

import com.growcontrol.gccommon.meta.Meta;


public class metaVariable extends Meta {
	private static final long serialVersionUID = 11L;

	protected volatile Integer value = null;


	protected metaVariable(final String typeStr) {
		super(typeStr);
	}


	@Override
	public String getValueStr() {
		if(this.value == null)
			return null;
		return this.value.toString();
	}
	@Override
	public metaVariable clone() {
		return new metaVariable(typeStr());
	}


}
