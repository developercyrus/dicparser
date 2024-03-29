/*****************************************************************************
 * 
 * @(#)Element.java  2009/03
 *
 *  Copyright (C) 2009  Tim Bron<jinxingquan@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 *****************************************************************************/
package org.jin.dic.data.ks;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public interface Element {
  /**
   * @param para may be the bytes tend to read, or size of sub elements to read
   */
  public void read(DataInput in, int para) throws IOException, BadFormatException;

  public void write(DataOutput out) throws IOException;

}
