/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2014 Neil C Smith.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 3 for more details.
 *
 * You should have received a copy of the GNU General Public License version 3
 * along with this work; if not, see http://www.gnu.org/licenses/
 *
 *
 * Please visit http://neilcsmith.net if you need additional information or
 * have any questions.
 */
package net.neilcsmith.praxis.live.pxj;

import net.neilcsmith.praxis.compiler.ClassBodyContext;
import net.neilcsmith.praxis.video.java.VideoCodeDelegate;

/**
 *
 * @author Neil C Smith
 */
class VideoClassBodyContext extends ClassBodyContext<VideoCodeDelegate> {
    
    VideoClassBodyContext() {
        super(VideoCodeDelegate.class);
    }

    @Override
    public String[] getDefaultImports() {
        return new String[]{
            "java.util.*",
            "net.neilcsmith.praxis.video.render.*",
            "net.neilcsmith.praxis.video.render.ops.*",
            "net.neilcsmith.praxis.java.*",
            "net.neilcsmith.praxis.video.java.*",
            "static net.neilcsmith.praxis.java.Constants.*",
            "static net.neilcsmith.praxis.video.java.VideoConstants.*"
        };
    }

}
