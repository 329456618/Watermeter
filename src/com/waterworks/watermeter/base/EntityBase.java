/*
 * Copyright (c) 2013. wyouflf (wyouflf@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.waterworks.watermeter.base;

import java.io.Serializable;

import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.Transient;

public abstract class EntityBase implements Serializable {

	// /**
	// * Transient使这个列被忽略，不存入数据库
	// */
	// @Transient
	// private static final long serialVersionUID = 1L;
	
	
	// @Id // 如果主键没有命名名为id或_id的时，需要为主键添加此注解
	// @NoAutoIncrement // int,long类型的id默认自增，不想使用自增时添加此注解
	@Id
	private int _id;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

}
