/*****************************************************************************
 * 
 * @(#)LookUpMode.java  2009/03
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
package org.jin.dic.data.sk.i;

public class LookUpMode {
  
  /* These two are the basics ones. */
  static final int EXACT         = 0;
  static final int LASTBEFORE    = 1;

  /* These ones are derived. */
  static final int FIRSTAFTER    = 2;
  static final int EXACTORBEFORE = 3;
  static final int EXACTORAFTER  = 4;

  private int      mode;

  public LookUpMode(int mode) {
    this.mode = mode;
  }
  public LookUpMode(String sMode) {
    if(sMode.equals("EXACT")) mode = EXACT;
    if(sMode.equals("LASTBEFORE")) mode = LASTBEFORE;
    if(sMode.equals("FIRSTAFTER")) mode = FIRSTAFTER;
    if(sMode.equals("EXACTORBEFORE")) mode = EXACTORBEFORE;
    if(sMode.equals("EXACTORAFTER")) mode = EXACTORAFTER;
    mode = EXACT;
  }

  public int getMode(){
    return mode;
  }
  
}
