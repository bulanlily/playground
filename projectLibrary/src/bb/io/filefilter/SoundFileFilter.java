/*
Copyright � 2008 Brent Boyer

This program is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the Lesser GNU General Public License for more details.

You should have received a copy of the Lesser GNU General Public License along with this program (see the license directory in this project).  If not, see <http://www.gnu.org/licenses/>.
*/

package bb.io.filefilter;

import bb.io.DirUtil;

/**
* File filter that accepts sound files.
* <p>
* Specificly, this file filter accepts only normal files whose names end with the extension ".mp3" (case insensitive).
* Directories and other file system elements are always rejected, which could affect directory drill down
* (see {@link DirUtil#getTree DirUtil.getTree} and {@link DirUtil#getFilesInTree DirUtil.getFilesInTree}).
* <p>
* This class is multithread safe: it is immutable.
* In particular, it maintains its {@link SuffixFilter ancestor class}'s immutability.
* <p>
* @author Brent Boyer
*/
public class SoundFileFilter extends SuffixFilter {
	
	/** Constructs a new SoundFileFilter instance. */
	public SoundFileFilter() {
		super(".mp3");
	}
	
	@Override public String getDescription() { return "Sound files"; }
	
}
