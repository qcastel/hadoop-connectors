/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.hadoop.fs.gcs;

import com.google.cloud.hadoop.gcsio.FileInfo;
import com.google.cloud.hadoop.gcsio.GoogleCloudStorageReadOptions;
import java.io.IOException;
import java.net.URI;
import org.apache.hadoop.fs.FileSystem;

public class GoogleHadoopFSInputStream extends InstrumentatedgoogleHadoopFSInputStream {
  GoogleHadoopFSInputStream(
      GoogleHadoopFileSystemBase ghfs,
      URI gcsPath,
      GoogleCloudStorageReadOptions readOptions,
      FileSystem.Statistics statistics)
      throws IOException {
    super(ghfs, gcsPath, readOptions, statistics);
  }

  GoogleHadoopFSInputStream(
      GoogleHadoopFileSystemBase ghfs, FileInfo fileInfo, FileSystem.Statistics statistics)
      throws IOException {
    super(ghfs, fileInfo, statistics);
  }
}
