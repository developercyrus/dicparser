/*****************************************************************************
 * 
 * @(#)Avatar.java  2009/03
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
package org.jin.dic.data.ldoce.v5;

public class Avatar {
  
  private int packageId;
  private int pType;
  private int fType;
  private int fileId;
  
  public int getPackageId(){
    return packageId;
  }
  public void setPackageId(int packageId){
    this.packageId = packageId;
  }
  public int getPType(){
    return pType;
  }
  public void setPType(int type){
    pType = type;
  }
  public int getFType(){
    return fType;
  }
  public void setFType(int type){
    fType = type;
  }
  public int getFileId(){
    return fileId;
  }
  public void setFileId(int fileId){
    this.fileId = fileId;
  }

}
