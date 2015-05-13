/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.machine.shared;

/**
 * Command that can be used to create {@link Process} in a machine.
 *
 * @author gazarenkov
 * @author Eugene Voevodin
 */
public interface Command {

    String getId();

    void setId(String id);

    Command withId(String id);

    String getName();

    void setName(String name);

    Command withName(String name);

    String getCommandLine();

    void setCommandLine(String commandLine);

    Command withCommandLine(String commandLine);

    String getCreator();

    void setCreator(String creator);

    Command withCreator(String creator);

    String getWorkspaceId();

    void setWorkspaceId(String workspaceId);

    Command withWorkspaceId(String workspaceId);

    String getVisibility();

    void setVisibility(String visibility);

    Command withVisibility(String visibility);

    String getType();

    void setType(String type);

    Command withType(String type);

    String getWorkingDir();

    void setWorkingDir(String workingDir);

    Command withWorkingDir(String workingDir);
}
